package com.example.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddPlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_plan);
    }

    public void goToMainActivity(View view) {
        Intent toAdd = new Intent(this,MainActivity.class);
        startActivity(toAdd);
    }
}
