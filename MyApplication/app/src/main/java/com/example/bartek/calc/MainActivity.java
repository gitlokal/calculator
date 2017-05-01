package com.example.bartek.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private String display;
    private enum jobs { add, subs, multipl, div}
    private jobs job;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = (TextView) findViewById(R.id.editText1);
        textview2 = (TextView) findViewById(R.id.editText2);
        textview3 = (TextView) findViewById(R.id.editText3);
        textview4 = (TextView) findViewById(R.id.editText4);
        display = new String();


    }

    public void onClick(View view) {
        button = (Button) view;
        display += button.getText().toString();
        textview1.setText(display);
    }

    public void onAdding(View view) {
        button = (Button) view;
        textview3.setText(display);
        textview2.setText("+");
        textview1.setText("");
        display = "";
        job = jobs.add;

    }

    public void onSubsract(View view) {
        button = (Button) view;
        textview3.setText(display);
        textview2.setText("-");
        textview1.setText("");
        display = "";
        job = jobs.subs;

    }

    public void onMultiply(View view) {
        button = (Button) view;
        textview3.setText(display);
        textview2.setText("*");
        textview1.setText("");
        display = "";
        job = jobs.multipl;

    }

    public void onDivision(View view) {
        button = (Button) view;
        textview3.setText(display);
        textview2.setText("/");
        textview1.setText("");
        display = "";
        job = jobs.div;

    }

    public void onEqual(View view) {
        textview4.setText(textview3.getText());
        textview3.setText(textview2.getText());
        textview2.setText(textview1.getText());
        int x = Integer.parseInt(textview4.getText().toString());
        int y = Integer.parseInt(textview2.getText().toString());

        textview1.setText("");
        switch(job) {
            case add:   textview1.setText( Integer.toString(x+y));
                break;
            case subs:   textview1.setText( Integer.toString(x-y));
                break;
            case multipl:  textview1.setText( Integer.toString(x*y));
                break;
            case div:  textview1.setText( Integer.toString(x/y));
                break;
        }


    }

    public void onDelete(View view) {
        button = (Button) view;
        display = "";
        textview1.setText(display);
        textview2.setText(display);
        textview3.setText(display);
        textview4.setText(display);

    }

    public void onResult(View view) {


    }
}
