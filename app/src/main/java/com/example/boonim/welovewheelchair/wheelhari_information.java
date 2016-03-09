package com.example.boonim.welovewheelchair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class wheelhari_information extends AppCompatActivity {

    public RadioButton radioUp , radioDown;
    public TextView txtNumber;
    public Button bntCheck;
    public RadioButton radio ,radio2 ,radio3 , radio4 ,radio5 ,radio6 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheelhari_information);
        RadioGroup radioGroup;


        radio = (RadioButton) findViewById(R.id.radioButton);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);

        radio4 = (RadioButton) findViewById(R.id.radioButton4);
        radio5 = (RadioButton) findViewById(R.id.radioButton5);
        radio6 = (RadioButton) findViewById(R.id.radioButton6);




    }
}
