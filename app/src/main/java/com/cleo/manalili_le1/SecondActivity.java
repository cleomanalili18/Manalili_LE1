package com.cleo.manalili_le1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {


    TextView raGrade;
    TextView finalGrade;

    Button btn_Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_Return = (Button) findViewById(R.id.btnReturn);

        raGrade = (TextView) findViewById(R.id.raGrade);
        String ra = getIntent().getExtras().getString("raGrade");
        raGrade.setText("Your RA is: " + ra);

        finalGrade = (TextView) findViewById(R.id.finalGrade);
        String fg = getIntent().getExtras().getString("finalGrade");
        finalGrade.setText("Your final grade is: " + fg);

    }

    public void goBackToMain (View view) {
        Intent intent2 = new Intent (this, MainActivity.class);
        startActivity(intent2);
    }
}
