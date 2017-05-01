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


    }

    public void onEqual(View view) {
        textview4.setText(textview3.getText());
        textview3.setText(textview2.getText());
        textview2.setText(textview1.getText());
        textview1.setText("");



    }

    public void onDelete(View view) {
        button = (Button) view;
        display = "";
        textview1.setText(display);

    }

    public void onResult(View view) {


    }
}
