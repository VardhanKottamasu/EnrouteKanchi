package com.example.enroutekanchi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        final Animation ani1= AnimationUtils.loadAnimation(this,R.anim.anim1);
        final Animation ani2= AnimationUtils.loadAnimation(this,R.anim.anim2);
        final Animation ani3= AnimationUtils.loadAnimation(this,R.anim.anim3);
        final Animation ani4= AnimationUtils.loadAnimation(this,R.anim.anim4);
        final Animation ani5= AnimationUtils.loadAnimation(this,R.anim.anim5);
        final Animation ani6= AnimationUtils.loadAnimation(this,R.anim.anim6);
        final Animation ani7= AnimationUtils.loadAnimation(this,R.anim.anim7);
        final Animation ani8= AnimationUtils.loadAnimation(this,R.anim.anim8);
        final Animation ani9= AnimationUtils.loadAnimation(this,R.anim.anim9);
        final Animation ani10=AnimationUtils.loadAnimation(this,R.anim.anim10);
        Button b1=findViewById(R.id.att1);
        Button b2=findViewById(R.id.att2);
        Button b3=findViewById(R.id.att3);
        Button b4=findViewById(R.id.att4);
        Button b5=findViewById(R.id.att5);
        Button b6=findViewById(R.id.att6);
        Button b7=findViewById(R.id.att7);
        Button b8=findViewById(R.id.att8);
        Button b9=findViewById(R.id.att9);
        Button b10=findViewById(R.id.att10);
        b1.setAnimation(ani1);
        b2.setAnimation(ani2);
        b3.setAnimation(ani3);
        b4.setAnimation(ani4);
        b5.setAnimation(ani5);
        b6.setAnimation(ani6);
        b7.setAnimation(ani7);
        b8.setAnimation(ani8);
        b9.setAnimation(ani9);
        b10.setAnimation(ani10);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Attractions.this,Att1.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Attractions.this,Att2.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Attractions.this,Att3.class);
                startActivity(i3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Attractions.this,Att4.class);
                startActivity(i4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(Attractions.this,Att5.class);
                startActivity(i5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(Attractions.this,Att6.class);
                startActivity(i6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(Attractions.this,Att7.class);
                startActivity(i7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8=new Intent(Attractions.this,Att8.class);
                startActivity(i8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9=new Intent(Attractions.this,Att9.class);
                startActivity(i9);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10=new Intent(Attractions.this,Att10.class);
                startActivity(i10);
            }
        });


    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);
    }
}
