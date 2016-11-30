package com.chetsgani.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
    String[] src;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        src = new String[]{"Chetan", "Gani", "Sachin", "Testing", "Bengaluru", "Android", "Chets", "Chetya", "Chetu"};
        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < src.length; i++) {
            arrayList.add(src[i]);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, arrayList);
        actv.setAdapter(adapter);
        actv.setThreshold(1);
        actv.setText(src[1]);
        actv.setSelection(actv.getText().length());
        actv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actv.showDropDown();
            }
        });
    }
}
