package com.example.vencel.timetablegit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mondayTextView;
    TextView tuesdayTextView;
    TextView wednesdayTextView;
    TextView thursdayTextView;
    TextView fridayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.days_layout);

        mondayTextView = (TextView) findViewById(R.id.MondayTextView);
        tuesdayTextView = (TextView) findViewById(R.id.TuesdayTextView);
        wednesdayTextView = (TextView) findViewById(R.id.WednesdayTextView);
        thursdayTextView = (TextView) findViewById(R.id.ThursdayTextView);
        fridayTextView = (TextView) findViewById(R.id.FridayTextView);
    }

    public void ShowLesson(View view) {


    }
}
