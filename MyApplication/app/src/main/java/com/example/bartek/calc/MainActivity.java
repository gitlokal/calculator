package com.example.bartek.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textview;
    private String display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.editText);
        display = new String();

    }

    public void onClick(View view) {
        button = (Button) view;
        display += button.getText().toString();
        textview.setText(display);

    }

    public void onDelete(View view) {
        button = (Button) view;
        display = "";
        textview.setText(display);

    }
}
