package com.example.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ListView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CalendarView calendarView = new CalendarView(this);
        Calendar selectedCalendar = Calendar.getInstance();
        long selectedTimeInMills = selectedCalendar.getTimeInMillis();
    }

    public void goToAddPlanActivity(View view) {
        Intent toAdd = new Intent(this, AddPlanActivity.class);
        startActivity(toAdd);
    }
}
