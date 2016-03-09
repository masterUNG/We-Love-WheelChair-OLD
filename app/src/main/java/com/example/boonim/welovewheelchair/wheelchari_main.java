package com.example.boonim.welovewheelchair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class wheelchari_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheelchari_main);

        final ImageView  imageView8 , imageView9 ,imageView10 ;
        imageView8 =  (ImageView) findViewById(R.id.imageView8);
        imageView9 =  (ImageView) findViewById(R.id.imageView9);
       imageView10 =  (ImageView) findViewById(R.id.imageView10);
        imageView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
// พื้นที่ใช้ในการเขียนโปรแกรม เมื่อคลิกปุ่ม 1
                Intent go = new Intent(getApplicationContext(), wheelhari_information.class);
                startActivity(go);
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
// พื้นที่ใช้ในการเขียนโปรแกรม เมื่อคลิกปุ่ม 2
                Intent go = new Intent(getApplicationContext(), wheelchari_draw.class);
                startActivity(go);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
// พื้นที่ใช้ในการเขียนโปรแกรม เมื่อคลิกปุ่ม 3
                Intent go = new Intent(getApplicationContext(), wheelchari_howto.class);
                startActivity(go);
            }
        });


    }
}
