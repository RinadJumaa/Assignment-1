package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText FirstName;
    EditText LastName;
    Spinner dayspinner;
    Spinner monthspinner;
    EditText year;
    CheckBox mon,tue,wed,thu,fri,sat,sun;
    EditText comments;
    Spinner intrspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intrspinner = findViewById(R.id.instrSpn);
        FirstName = findViewById(R.id.FirstName);
        LastName = findViewById(R.id.LastName);
        dayspinner = findViewById(R.id.daysSpn);
        monthspinner = findViewById(R.id.monthsSpn);
        year = findViewById(R.id.birthYear);
        comments = findViewById(R.id.comment);

        mon = findViewById(R.id.checkBoxM);
        tue = findViewById(R.id.checkBoxTu);
        wed = findViewById(R.id.checkBoxW);
        thu = findViewById(R.id.checkBoxTh);
        fri = findViewById(R.id.checkBoxF);
        sat = findViewById(R.id.checkBoxSa);
        sun = findViewById(R.id.checkBoxSu);

        InstrumentsSpinner();
    }

    private void InstrumentsSpinner() {


        ArrayList<String> instrument = new ArrayList<>();
        instrument.add("Violin");
        instrument.add("Guitar");
        instrument.add("Bass");
        instrument.add("Drums");
        instrument.add("Vocals");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, instrument);

        intrspinner.setAdapter(adapter);


    }

    public void SaveData(View view) {

        Intent intent = new Intent(this, SummaryView.class);
        String first = FirstName.getText().toString();
        String last = LastName.getText().toString();
        String instrument = intrspinner.getSelectedItem().toString();
        String day = dayspinner.getSelectedItem().toString();
        String month = monthspinner.getSelectedItem().toString();
        String birthYear = year.getText().toString();
        intent.putExtra("FIRST", first);
        intent.putExtra("LAST",last);
        intent.putExtra("INSTRUMENT", instrument);
        intent.putExtra("DAY",day);
        intent.putExtra("MONTH", month);
        intent.putExtra("YEAR", birthYear);

        if (mon.isChecked())
            intent.putExtra("MONDAY", "Monday");
        else
            intent.putExtra("MONDAY", "");
        if (tue.isChecked())
            intent.putExtra("TUESDAY", "Tuesday");
        else
            intent.putExtra("TUESDAY", "");
        if (wed.isChecked())
            intent.putExtra("WEDNESDAY", "Wednesday");
        else
            intent.putExtra("WEDNESDAY", "");
        if (thu.isChecked())
            intent.putExtra("THURSDAY", "Thursday");
        else
            intent.putExtra("THURSDAY", "");
        if (fri.isChecked())
            intent.putExtra("FRIDAY", "Friday");
        else
            intent.putExtra("FRIDAY", "");
        if (sat.isChecked())
            intent.putExtra("SATURDAY", "Saturday");
        else
            intent.putExtra("SATURDAY", "");
        if (sun.isChecked())
            intent.putExtra("SUNDAY", "Sunday");
        else
            intent.putExtra("SUNDAY", "");


        String cmt = comments.getText().toString();
        intent.putExtra("CMT", cmt);
        //intent.putExtra("LAST", last);
        startActivity(intent);
    }

}