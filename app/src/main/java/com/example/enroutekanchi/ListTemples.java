package com.example.enroutekanchi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.List;

public class ListTemples extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listtemples);
        final Animation ani1= AnimationUtils.loadAnimation(this,R.anim.anim1);
        final Animation ani2= AnimationUtils.loadAnimation(this,R.anim.anim2);
        final Animation ani3= AnimationUtils.loadAnimation(this,R.anim.anim3);
        final Animation ani4= AnimationUtils.loadAnimation(this,R.anim.anim4);
        final Animation ani5= AnimationUtils.loadAnimation(this,R.anim.anim5);
        final Animation ani6= AnimationUtils.loadAnimation(this,R.anim.anim6);
        final Animation ani7= AnimationUtils.loadAnimation(this,R.anim.anim7);
        final Animation ani8= AnimationUtils.loadAnimation(this,R.anim.anim8);
        final Animation ani9= AnimationUtils.loadAnimation(this,R.anim.anim9);
        final Animation ani10= AnimationUtils.loadAnimation(this,R.anim.anim10);
        final Animation ani11= AnimationUtils.loadAnimation(this,R.anim.anim11);
        final Animation ani12= AnimationUtils.loadAnimation(this,R.anim.anim12);
        final Animation ani13= AnimationUtils.loadAnimation(this,R.anim.anim13);

        Button a1=findViewById(R.id.btnt1);
        Button b1=findViewById(R.id.btnt2);
        Button c1=findViewById(R.id.btnt3);
        Button d1=findViewById(R.id.btnt4);
        Button e1=findViewById(R.id.btnt5);
        Button f1=findViewById(R.id.btnt6);
        Button g1=findViewById(R.id.btnt7);
        Button h1=findViewById(R.id.btnt8);
        Button i1=findViewById(R.id.btnt9);
        Button j1=findViewById(R.id.btnt10);
        Button k1=findViewById(R.id.btnt11);
        Button l1=findViewById(R.id.btnt12);
        Button m1=findViewById(R.id.btnt13);

        a1.setAnimation(ani1);
        b1.setAnimation(ani2);
        c1.setAnimation(ani3);
        d1.setAnimation(ani4);
        e1.setAnimation(ani5);
        f1.setAnimation(ani6);
        g1.setAnimation(ani7);
        h1.setAnimation(ani8);
        i1.setAnimation(ani9);
        j1.setAnimation(ani10);
        k1.setAnimation(ani11);
        l1.setAnimation(ani12);
        m1.setAnimation(ani13);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ListTemples.this, SankaraMutt.class);
                startActivity(i1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j1=new Intent(ListTemples.this,KamakshiTemple.class);
                startActivity(j1);
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k1=new Intent(ListTemples.this,EkambareswararTemple.class);
                startActivity(k1);
            }
        });
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l1=new Intent(ListTemples.this,KailasanatharTemple.class);
                startActivity(l1);
            }
        });
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m1 = new Intent(ListTemples.this, VaradarajaTemple.class);
                startActivity(m1);
            }
        });
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n1 = new Intent(ListTemples.this, UlagalantharTemple.class);
                startActivity(n1);
            }
        });
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o1=new Intent(ListTemples.this,KumarakottamTemple.class);
                startActivity(o1);
            }
        });
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p1=new Intent(ListTemples.this,ChitraguptaTemple.class);
                startActivity(p1);
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q1=new Intent(ListTemples.this,KachabeswararTemple.class);
                startActivity(q1);
            }
        });
        j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ListTemples.this, pandavadootha_temple.class);
                startActivity(i1);
            }
        });
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ListTemples.this, astabujakaram_Temple.class);
                startActivity(i1);
            }
        });
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ListTemples.this, yatothkari_temple.class);
                startActivity(i1);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(ListTemples.this, nilthingal_Temple.class);
                startActivity(i1);
            }
        });

    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);
    }
}
