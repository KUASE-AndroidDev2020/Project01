package com.example.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

    public void onClick(View view){
        Intent toAdd = new Intent(this,MainActivity.class);
        EditText edit=(EditText)findViewById(R.id.Date);
                startActivity(toAdd);
    }
}
