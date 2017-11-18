package com.example.rutina_sdk17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class EditNextEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_next_event);
        getSupportActionBar().setTitle("ערוך הארוע הבא");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // spinners
        ArrayAdapter<CharSequence> adapter;
        Spinner spnTimeUnitType = findViewById(R.id.spn_time_unit_type);
        adapter = ArrayAdapter.createFromResource(this, R.array.time_unit_types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnTimeUnitType.setAdapter(adapter);
        Spinner spnNumTimeUnits = findViewById(R.id.spn_num_time_units);
        adapter = ArrayAdapter.createFromResource(this, R.array.num_time_units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnNumTimeUnits.setAdapter(adapter);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return false;
    }

    public void startEditEventTimeActivity(View view)
    {
        Intent intent = new Intent(this, EditEventTimeActivity.class);
        startActivity(intent);
    }

    public void onEventTimeExactClicked(View view)
    {
        CheckBox chkIsEventTimeExact = (CheckBox) view;
        enableDisableView(findViewById(R.id.lay_set_event_time_reminder), !chkIsEventTimeExact.isChecked());
        enableDisableView(findViewById(R.id.lay_set_event_time_reminder_active), !chkIsEventTimeExact.isChecked());
    }

    private void enableDisableView(View view, boolean enabled) {
        view.setEnabled(enabled);
        if ( view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;
            for ( int idx = 0 ; idx < group.getChildCount() ; idx++ ) {
                enableDisableView(group.getChildAt(idx), enabled);
            }
        }
    }
}
