package com.example.rutina_sdk17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NewRoutineActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_routine);
        getSupportActionBar().setTitle("צור רוטינה");
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
}
