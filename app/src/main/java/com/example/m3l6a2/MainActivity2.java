package com.example.m3l6a2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
public class MainActivity2 extends AppCompatActivity {
    ImageView img;
    Button btn;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView2);
        btn=findViewById(R.id.button);
        Drawable[] FactImages =new Drawable[5];
        Resources res=getResources();
        FactImages[0]=res.getDrawable(R.drawable.factone);
        FactImages[1]=res.getDrawable(R.drawable.factwo);
        FactImages[2]=res.getDrawable(R.drawable.factthree);
        FactImages[3]=res.getDrawable(R.drawable.factfour);
        FactImages[4]=res.getDrawable(R.drawable.factfive);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Random randomNumber=new Random();
                int numberGenerated=randomNumber.nextInt(5-0)+0;
                        img.setImageDrawable(FactImages[numberGenerated]);

            }
        });

    }
}