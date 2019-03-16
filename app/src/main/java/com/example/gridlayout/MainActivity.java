package com.example.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private GridLayout mGridLayout;
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridLayout=findViewById(R.id.gridLayout);

        img1=findViewById(R.id.pic1);
        img2=findViewById(R.id.pic2);
        img3=findViewById(R.id.pic3);
        img4=findViewById(R.id.pic4);
        img5=findViewById(R.id.pic5);
        img6=findViewById(R.id.pic6);
        img7=findViewById(R.id.pic7);
        img8=findViewById(R.id.pic8);
        img9=findViewById(R.id.pic9);
        img10=findViewById(R.id.pic10);
        img11=findViewById(R.id.pic11);
        img12=findViewById(R.id.pic12);
        img13=findViewById(R.id.pic13);
        img14=findViewById(R.id.pic14);
        img15=findViewById(R.id.pic15);


        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);
        img12.setOnClickListener(this);
        img13.setOnClickListener(this);
        img14.setOnClickListener(this);
        img15.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int viewID=v.getId();
        Log.i("id",viewID+"");

        switch (viewID){
            case R.id.pic1:
                img1.setImageResource(R.drawable.image_03);
                break;
            case R.id.pic2:
                img2.setImageResource(R.drawable.image_01);
                break;
            case R.id.pic3:
                img3.setImageResource(R.drawable.image_02);
                break;
            case R.id.pic4:
                img4.setImageResource(R.drawable.image_01);
                break;
            case R.id.pic5:
                img5.setImageResource(R.drawable.image_02);
                break;
            case R.id.pic6:
                img6.setImageResource(R.drawable.image_03);
                break;
            case R.id.pic7:
                img7.setImageResource(R.drawable.image_02);
                break;
            case R.id.pic8:
                img8.setImageResource(R.drawable.image_01);
                break;
            case R.id.pic9:
                img9.setImageResource(R.drawable.image_03);
                break;
            case R.id.pic10:
                img10.setImageResource(R.drawable.image_01);
                break;
            case R.id.pic11:
                img11.setImageResource(R.drawable.image_03);
                break;
            case R.id.pic12:
                img12.setImageResource(R.drawable.image_01);
                break;
            case R.id.pic13:
                img13.setImageResource(R.drawable.image_03);
                break;
            case R.id.pic14:
                img14.setImageResource(R.drawable.image_02);
                break;
            case R.id.pic15:
                img15.setImageResource(R.drawable.image_03);
                break;
        }
    }
}

