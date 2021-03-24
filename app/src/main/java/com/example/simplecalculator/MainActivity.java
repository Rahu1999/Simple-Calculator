package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstvalue,secondvalue;
    TextView ans;
    Button add,sub,multi,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstvalue = findViewById(R.id.firstnumber);
        secondvalue = findViewById(R.id.secondnumber);
        ans = findViewById(R.id.ans);
        add =findViewById(R.id.add);
        sub =findViewById(R.id.sub);
        multi =findViewById(R.id.multi);
        div =findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int first,second,ans1;
                first = Integer.parseInt(firstvalue.getText().toString());
                second = Integer.parseInt(secondvalue.getText().toString());
                ans1 = first+second;
                ans.setText("Your ans = "+ans1);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int first,second,ans2;
                first = Integer.parseInt(firstvalue.getText().toString());
                second = Integer.parseInt(secondvalue.getText().toString());
                ans2 = first-second;
                ans.setText("Your ans = "+ans2);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int first,second,ans3;
                first = Integer.parseInt(firstvalue.getText().toString());
                second = Integer.parseInt(secondvalue.getText().toString());
                ans3 = first*second;
                ans.setText("Your ans = "+ans3);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int first,second,ans4;
                first = Integer.parseInt(firstvalue.getText().toString());
                second = Integer.parseInt(secondvalue.getText().toString());
                ans4 = first/second;
                ans.setText("Your ans = "+ans4);
            }
        });

    }
}