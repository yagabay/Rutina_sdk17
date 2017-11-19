package com.example.rutina_sdk17;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RoutinesBaseAdapter extends BaseAdapter {

    private Context _context;
    private LayoutInflater _inflater;
    private ArrayList<Routine> _items;

    public RoutinesBaseAdapter(Context context, ArrayList<Routine> items) {
        _context = context;
        _items = items;
        _inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return _items.size();
    }

    @Override
    public Routine getItem(int position) {
        return _items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = _inflater.inflate(R.layout.list_item_routine, parent, false);
        TextView txvRoutineTitle = (TextView) view.findViewById(R.id.txv_routine_title);
        TextView txvRoutinePrevEvent = (TextView) view.findViewById(R.id.txv_routine_prev_event);
        TextView txvRoutineNextEvent = (TextView) view.findViewById(R.id.txv_routine_next_event);
        Routine routine = getItem(position);
        txvRoutineTitle.setText(routine.getTitle());
        txvRoutinePrevEvent.setText(routine.getPrevEventTime());
        txvRoutineNextEvent.setText(routine.getNextEventTime());
        return view;
    }

}
