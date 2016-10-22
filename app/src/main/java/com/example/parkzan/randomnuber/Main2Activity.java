package com.example.parkzan.randomnuber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String value2 = intent.getStringExtra("textShow");
        String value3 = intent.getStringExtra("numbersh");
        TextView textViewsh = (TextView) findViewById(R.id.textsh);
        textViewsh.setText(value2);
        TextView textView = (TextView) findViewById(R.id.textView_2);
        textView.setText(value3);

    }

}
