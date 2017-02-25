package com.example.sambal.layoutnui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1, t2, t3;
    Button bn;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.layout_part_1);
//        t1= (TextView) findViewById(R.id.tvTopLeft);
//        t2= (TextView) findViewById(R.id.tvBelow);
//        t3= (TextView) findViewById(R.id.tvBelowRL);
//        bn= (Button) findViewById(R.id.btnTopRight);


        setContentView(R.layout.layout_part_2);
        b1 = (Button) findViewById(R.id.btnLeft);
        b2 = (Button) findViewById(R.id.btnRight);
        b1.setOnClickListener(new btnclick());
        b2.setOnClickListener(new btnclick());



    }

    private class btnclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v == b1) {
                b1.setText("");
                b2.setText("ckick me");
            } else {
                b2.setText("");
                b1.setText("ckick me");
            }
        }
    }
}