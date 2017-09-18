package com.cleo.manalili_le1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText q1;
    EditText q2;
    EditText seatworks;
    EditText labExer;
    EditText major;

    Double ra;
    Double fg;
    Button compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        seatworks = (EditText) findViewById(R.id.seatworks);
        labExer = (EditText) findViewById(R.id.labExer);
        major = (EditText) findViewById(R.id.major);
        compute = (Button) findViewById(R.id.compute);
    }

    public void calculate(View view) {
        Double quiz1 = Double.parseDouble(q1.getText().toString());
        Double quiz2 = Double.parseDouble(q2.getText().toString());
        Double sw = Double.parseDouble(seatworks.getText().toString());
        Double lab = Double.parseDouble(labExer.getText().toString());
        Double me = Double.parseDouble(major.getText().toString());

        ra = (quiz1 * .1) + (quiz2 * .1) + (sw * .1) +
                (lab * .4) + (me * .3);

        if (ra < 60) {
            fg = 5.0;
        } else if (ra >= 60 && ra < 66) {
            fg = 3.0;
        } else if (ra >= 66 && ra < 71) {
            fg = 2.75;
        } else if (ra >= 71 && ra < 76) {
            fg = 2.5;
        } else if (ra >= 76 && ra < 81) {
            fg = 2.25;
        } else if (ra >= 81 && ra < 86) {
            fg = 2.0;
        } else if (ra >= 86 && ra < 91) {
            fg = 1.75;
        } else if (ra >= 91 && ra < 93) {
            fg = 1.5;
        } else if (ra >= 93 && ra < 95) {
            fg = 1.25;
        } else if (ra >= 95 && ra <= 100) {
            fg = 1.0;
        } else {
            fg = 0.0;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("raGrade", ra.toString());
        intent.putExtra("finalGrade", fg.toString());
        startActivity(intent);
    }
}
