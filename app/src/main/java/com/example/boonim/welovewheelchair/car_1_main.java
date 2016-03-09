package com.example.boonim.welovewheelchair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class car_1_main extends AppCompatActivity {


    ImageView imageView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_1_main);

        imageView16 =  (ImageView) findViewById(R.id.imageView16);


        imageView16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
// พื้นที่ใช้ในการเขียนโปรแกรม เมื่อคลิกปุ่ม 1
                Intent go = new Intent(getApplicationContext(), car_1_plane.class);
                startActivity(go);
            }
        });
    }
}
