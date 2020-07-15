package com.example.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] subjects = {"7/1 12:40","7/2","7/3","7/4 16:00","7/5","7/6","7/7","7/8","7/9","7/10","7/11","7/12","7/13","7/14","7/15","7/16 17:30","7/17","7/18","7/19","7/20","7/21","7/22","7/23","7/24","7/25","7/26","7/27","7/28 13:00","7/29","7/30","7/31"};
        String[] comments = {"英会話Ⅰ","","","誕生日会","","","","","","","","","","","","眼科","","","","","","","","","","","","カラオケ","","",""};

        List<Map<String, String>> data = new ArrayList<Map<String, String>>();
        for (int i=0; i<subjects.length; i++){
            Map<String, String> item = new HashMap<String, String>();
            item.put("Subject", subjects[i]);
            item.put("Comment", comments[i]);
            data.add(item);

            SimpleAdapter adapter = new SimpleAdapter(this, data,
                    android.R.layout.simple_list_item_2,
                    new String[] { "Subject", "Comment" },
                    new int[] { android.R.id.text1, android.R.id.text2});
            ListView listView = (ListView)findViewById(R.id.Days);
            listView.setAdapter(adapter);
        }
    }
    public void goToAddPlanActivity(View view) {
        Intent toAdd = new Intent(this, AddPlanActivity.class);
        startActivity(toAdd);
    }
}
