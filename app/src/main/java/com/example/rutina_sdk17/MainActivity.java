package com.example.rutina_sdk17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final RoutinesBaseAdapter routineBaseAdapter = new RoutinesBaseAdapter(this, generateRoutinesList());
        ListView lsvRoutines = findViewById(R.id.lsv_routines);
        lsvRoutines.setAdapter(routineBaseAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.itm_create_routine:
                startCreateRoutineActivity(null);
                return true;
            case R.id.itm_edit_routine:
                startEditRoutineActivity(null);
                return true;
            case R.id.itm_edit_prev_event:
                startEditPrevEventActivity(null);
                return true;
            case R.id.itm_edit_next_event:
                startEditNextEventActivity(null);
                return true;
            case R.id.itm_edit_event_time:
                startEditEventTimeActivity(null);
                return true;
        }
        return false;
    }

    public void startCreateRoutineActivity(View view)
    {
        Intent intent = new Intent(this, NewRoutineActivity.class);
        startActivity(intent);
    }

    public void startEditRoutineActivity(View view)
    {
        Intent intent = new Intent(this, EditRoutineActivity.class);
        startActivity(intent);
    }

    public void startEditPrevEventActivity(View view)
    {
        Intent intent = new Intent(this, EditPrevEventActivity.class);
        startActivity(intent);
    }

    public void startEditNextEventActivity(View view)
    {
        Intent intent = new Intent(this, EditNextEventActivity.class);
        startActivity(intent);
    }

    public void startEditEventTimeActivity(View view)
    {
        Intent intent = new Intent(this, EditEventTimeActivity.class);
        startActivity(intent);
    }

    private ArrayList<Routine> generateRoutinesList(){
        ArrayList<Routine> routines = new ArrayList<>();
        routines.add(new Routine("רופא עור", "1.1.17", "1.6.17"));
        routines.add(new Routine("טסט לאוטו", "1.5.17", "1.6.18"));
        return routines;
    }
}
