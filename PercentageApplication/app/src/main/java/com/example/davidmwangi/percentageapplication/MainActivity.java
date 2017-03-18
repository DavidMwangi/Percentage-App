package com.example.davidmwangi.percentageapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView total;
    EditText percentage;
    EditText number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total = (TextView) findViewById(R.id.total);
        percentage = (EditText) findViewById(R.id.percentage);
        number = (EditText) findViewById(R.id.number);

        Button calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                float percent = Float.parseFloat(percentage.getText().toString());
                float dec = percent / 100;
                float tot = dec * Float.parseFloat(number.getText().toString());

                total.setText(Float.toString(tot));

            }
        });
    }


}
