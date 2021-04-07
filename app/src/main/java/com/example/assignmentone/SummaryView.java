package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryView extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_view);
        Intent intent = getIntent();
        String first = intent.getStringExtra("FIRST");
        TextView fName = findViewById(R.id.txtFirstName);

        String last = intent.getStringExtra("LAST");
        fName.setText(first + " " + last);

        String instr = intent.getStringExtra("INSTRUMENT");
        TextView instrument = findViewById(R.id.instrument);
        instrument.setText(instr);

        String day = intent.getStringExtra("DAY");
        String month = intent.getStringExtra("MONTH");
        String year = intent.getStringExtra("YEAR");

        TextView DOB = findViewById(R.id.birthDate);

        DOB.setText(day +" - " + month+" - " + year);

        String mon = intent.getStringExtra("MONDAY");
        String tue = intent.getStringExtra("TUESDAY");
        String wed = intent.getStringExtra("WEDNESDAY");
        String thu = intent.getStringExtra("THURSDAY");
        String fri = intent.getStringExtra("FRIDAY");
        String sat = intent.getStringExtra("SATURDAY");
        String sun = intent.getStringExtra("SUNDAY");

        TextView days = findViewById(R.id.days);

        days.setText(mon + "\n" +tue + "\n" + wed + "\n"+ thu+ "\n"+ fri+ "\n" + sat+
                "\n" + sun);

        String cmt = intent.getStringExtra("CMT");
        TextView extra = findViewById(R.id.txtcomments);

        extra.setText(cmt);



    }
}