package com.example.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList data = new ArrayList<>();
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
        data.add("8");
        data.add("9");
        data.add("10");
        data.add("11");
        data.add("12");
        data.add("13");
        data.add("14");
        data.add("15");
        data.add("16");
        data.add("17");
        data.add("18");
        data.add("19");
        data.add("20");
        data.add("21");
        data.add("22");
        data.add("23");
        data.add("24");
        data.add("25");
        data.add("26");
        data.add("27");
        data.add("28");
        data.add("29");
        data.add("30");
        data.add("31");

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);

        ListView listView = (ListView)findViewById(R.id.Days);
        listView.setAdapter(adapter);
    }
    public void goToAddPlanActivity(View view) {
        Intent toAdd = new Intent(this, AddPlanActivity.class);
        startActivity(toAdd);
    }
}
