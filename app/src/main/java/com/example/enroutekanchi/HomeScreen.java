package com.example.enroutekanchi;
//import androidx.annotation.StringDef;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
//import android.animation.Animator;
//import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.content.DialogInterface;
import android.widget.ImageView;
import android.widget.Toast;
//import android.widget.Toolbar;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
//import android.widget.Toolbar;
//import org.w3c.dom.Text;
//import java.sql.BatchUpdateException;

public class HomeScreen extends AppCompatActivity{
    CarouselView c;
    static public final int REQUEST_LOCATION=1;
    int[] sampleImages={R.drawable.tmp1,R.drawable.tmp2,R.drawable.tmp3,R.drawable.tmp4,R.drawable.tmp6,R.drawable.tmp7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
             ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
        }
        c=findViewById(R.id.carousel);
        c.setPageCount(sampleImages.length);
        c.setImageListener(imageListener);
        final Animation ani1= AnimationUtils.loadAnimation(this,R.anim.anim1);
        final Animation ani2= AnimationUtils.loadAnimation(this,R.anim.anim2);
        final Animation ani3= AnimationUtils.loadAnimation(this,R.anim.anim3);
        final Animation ani4= AnimationUtils.loadAnimation(this,R.anim.anim4);
        final Animation ani5= AnimationUtils.loadAnimation(this,R.anim.anim5);
        final Animation ani6= AnimationUtils.loadAnimation(this,R.anim.anim6);
        final Animation ani7= AnimationUtils.loadAnimation(this,R.anim.anim7);
        final Animation ani8= AnimationUtils.loadAnimation(this,R.anim.anim8);
        Button a=findViewById(R.id.btn0);
        Button b=findViewById(R.id.btn1);
        Button c=findViewById(R.id.btn2);
        Button d=findViewById(R.id.btn3);
        Button e=findViewById(R.id.btn4);
        Button f=findViewById(R.id.btn5);
        Button g=findViewById(R.id.btn6);
        Button h=findViewById(R.id.btn7);
        a.setAnimation(ani1);
        b.setAnimation(ani2);
        c.setAnimation(ani3);
        d.setAnimation(ani4);
        e.setAnimation(ani5);
        f.setAnimation(ani6);
        g.setAnimation(ani7);
        h.setAnimation(ani8);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(HomeScreen.this,History_kanchi.class);
                startActivity(i1);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);//For animations on button click.
                //view.startAnimation(ani1);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HomeScreen.this, ListTemples.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                //view.startAnimation(ani);

            }

        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(HomeScreen.this,Hotels_Map.class);
                startActivity(j);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_right);
                //view.startAnimation(ani);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(HomeScreen.this,Commute.class);
                startActivity(k);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_right);
                //view.startAnimation(ani);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(HomeScreen.this,Attractions.class);
                startActivity(l);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_right);
                //view.startAnimation(ani);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(HomeScreen.this,info_App.class);
                startActivity(i1);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_right);
                //view.startAnimation(ani);
            }
        });
        g.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent j1=new Intent(HomeScreen.this,BugReport.class);
                startActivity(j1);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_right);
                //view.startAnimation(ani);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k1=new Intent(Intent.ACTION_SEND);
                k1.setType("text/plain");
                k1.putExtra(Intent.EXTRA_SUBJECT,"Enroute Kanchi");
                String s = "The one application for all the travel related information in Kanchipuram. ";
                s+="https://www.google.com";
                k1.putExtra(Intent.EXTRA_TEXT,s);
                startActivity(Intent.createChooser(k1,"Share via:"));
            }
        });
    }
    ImageListener imageListener=new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(HomeScreen.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(true)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_right);
                        finish();
                        Toast t = Toast.makeText(getApplicationContext(),"Thank you for visiting!",Toast.LENGTH_LONG);
                        t.show();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

}