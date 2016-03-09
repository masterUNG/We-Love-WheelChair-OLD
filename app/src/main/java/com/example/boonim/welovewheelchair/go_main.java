package com.example.boonim.welovewheelchair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class go_main extends AppCompatActivity {


    public GridView lv1;
    private String[] menu1 = {"สถาที่ท่องเที่ยว 1", "สถาที่ท่องเที่ยว 2", "สถาที่ท่องเที่ยว 3", "สถาที่ท่องเที่ยว 4", "สถาที่ท่องเที่ยว 5"};
    public ImageView im;
    private Integer[] mThumbIds = new Integer[]{R.drawable.car};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_main);

        im=(ImageView)findViewById(R.id.imageView2);
        lv1=(GridView)findViewById(R.id.gridView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu1);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1
                    , int arg2, long arg3) {
                if (arg2 == 0) {
// พื้นที่เขียนโปรแกรมเมื่อคลิกตำแหน่งที่ 0
                    im.setImageResource(R.drawable.car);
                }
                if (arg2 == 1) {
// พื้นที่เขียนโปรแกรมเมื่อคลิกตำแหน่งที่ 1
                    im.setImageResource(R.drawable.car);

                }
                if (arg2 == 2) {
// พื้นที่เขียนโปรแกรมเมื่อคลิกตำแหน่งที่ 2
                    im.setImageResource(R.drawable.car);
                }
                if (arg2 == 3) {
// พื้นที่เขียนโปรแกรมเมื่อคลิกตำแหน่งที่ 3
                    im.setImageResource(R.drawable.car);
                }
                if (arg2 == 4) {
// พื้นที่เขียนโปรแกรมเมื่อคลิกตำแหน่งที่ 4
                    im.setImageResource(R.drawable.car);
                }

            }
        });
    }

}
