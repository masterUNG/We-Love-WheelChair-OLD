package com.example.boonim.welovewheelchair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class welovewheelchair extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welovewheelchair);
        final ImageView  imlocation ,imVeechari, imageView3 , imshop ,imcar;

        imVeechari =  (ImageView) findViewById(R.id.imageView2);
        imageView3 =  (ImageView) findViewById(R.id.imageView3);
        imshop =  (ImageView) findViewById(R.id.imageView4);
        imlocation =  (ImageView) findViewById(R.id.imageView5);
        imcar =  (ImageView) findViewById(R.id.imageView);


        imVeechari.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
// พื้นที่ใช้ในการเขียนโปรแกรม เมื่อคลิกปุ่ม 1
                Intent go = new Intent(getApplicationContext(), wheelchari_main.class);
                startActivity(go);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
// พื้นที่ใช้ในการเขียนโปรแกรม เมื่อคลิกปุ่ม 2
                Intent go = new Intent(getApplicationContext(), wheelchari_shop.class);
                startActivity(go);
            }
        });
        imshop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
// พื้นที่ใช้ในการเขียนโปรแกรม เมื่อคลิกปุ่ม 3
                Intent go = new Intent(getApplicationContext(), car_1_main.class);
                startActivity(go);
            }
        });
        imlocation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
// พื้นที่ใช้ในการเขียนโปรแกรม เมื่อคลิกปุ่ม 4
                Intent go = new Intent(getApplicationContext(), car_1_main.class);
                startActivity(go);
            }
        });
    }

}

