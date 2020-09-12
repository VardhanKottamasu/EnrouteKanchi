package com.example.enroutekanchi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class BugReport extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug_report);
        wv=findViewById(R.id.webv);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setDomStorageEnabled(true);
        //wv.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        wv.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSd5CdS4VnOR3t0o56RUHGnUjUCMFZGsEgWIUklC2iCYS0w6fw/viewform?usp=sf_link");
//        final EditText e1=findViewById(R.id.c_name);
//        final EditText e2=findViewById(R.id.mail);
//        final EditText e3=findViewById(R.id.issue);
//        Button b1=findViewById(R.id.feed);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String name=e1.getText().toString();
//                String id=e2.getText().toString();
//                String iss=e3.getText().toString();
//                Intent email= new Intent(Intent.ACTION_SENDTO);
//                email.putExtra(Intent.EXTRA_TEXT,new String[]{name});
//                email.putExtra(Intent.EXTRA_EMAIL,id);
//                email.putExtra(Intent.EXTRA_SUBJECT,iss);
//                email.setType("message");
//                startActivity(Intent.createChooser(email,"Choose an app to send the email"));
//                Toast t= Toast.makeText(getApplicationContext(),"Thank you for submitting your Feedback!", Toast.LENGTH_LONG);
//                t.show();
//            }
//
//        });


    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_right);
    }
}
