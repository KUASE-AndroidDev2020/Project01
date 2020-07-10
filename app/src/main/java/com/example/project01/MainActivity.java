package com.example.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CalendarView calendarView = new CalendarView(this);
//現在の日付を取得する
        Calendar selectedCalendar = Calendar.getInstance();
        long selectedTimeInMills = selectedCalendar.getTimeInMillis();
    }

    public void goToAddPlanActivity(View view) {
        Intent toAdd = new Intent(this, AddPlanActivity.class);
        startActivity(toAdd);
    }
}
