package com.example.bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerTrinhdo;
    SeekBar seekBar;
    TextView textViewSb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerTrinhdo =(Spinner)findViewById(R.id.spinner);
        seekBar = findViewById(R.id.seekBar);
        textViewSb = findViewById(R.id.tvSeekbar);
        ArrayList<String> arrray= new ArrayList<>();
        arrray.add("Cao đẳng");
        arrray.add("Đại học");
        arrray.add("Cao học");
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrray);
        spinnerTrinhdo.setAdapter(arrayAdapter);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            textViewSb.setVisibility(View.INVISIBLE);
            textViewSb.setText(i +"/200");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}