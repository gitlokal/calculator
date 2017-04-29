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
    private TextView textview;
    private String display;
    private Stack stack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.editText);
        display = new String();
        stack = new Stack();

    }

    public void onClick(View view) {
        button = (Button) view;
        if(display.equals("0")) {
            display = button.getText().toString();
        } else if(button.getText().toString().equals("+")) {
                stack.push(display);
                stack.push("+");
             display += button.getText().toString();
        } else {
            display += button.getText().toString();
        }

        textview.setText(display);

    }

    public void onDelete(View view) {
        button = (Button) view;
        display = "";
        textview.setText(display);
        stack.removeAllElements();

    }

    public void onResult(View view) {
        int tmpX = 0;
        int tmpY = 0;
        String operation = "";
        if(!stack.empty()) {
            tmpX = Integer.parseInt((String) stack.pop());
            operation = (String) stack.pop();
            tmpY = Integer.parseInt((String) stack.pop());
            switch(operation) {
                case "+": textview.setText( Integer.toString(tmpX+tmpY));
            }
        }





    }
}
