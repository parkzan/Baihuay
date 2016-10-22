package com.example.parkzan.randomnuber;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.parkzan.randomnuber.model.Huay;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {
    Random r = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.random2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Huay h = new Huay();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("textShow","เลขท้าย 2 ตัว");
                i.putExtra("numbersh",h.getRandomTwoDigits());
                startActivity(i);
            }
        });
        Button btn2 = (Button) findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Huay h = new Huay();
                Intent i =new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("textShow","เลขท้าย 3 ตัว");
                i.putExtra("numbersh",h.getRandomThreeDigits());
                startActivity(i);
            }
        });

    }


}


