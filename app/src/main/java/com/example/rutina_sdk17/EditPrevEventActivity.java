package com.example.rutina_sdk17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class EditPrevEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_prev_event);
        getSupportActionBar().setTitle("ערוך הארוע הקודם");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

    public void startEditEventTime(View view)
    {
        Intent intent = new Intent(this, EditEventTimeActivity.class);
        startActivity(intent);
    }

}
