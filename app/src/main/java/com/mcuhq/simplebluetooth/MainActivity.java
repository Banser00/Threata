package com.mcuhq.simplebluetooth;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    private TextView welcome;
    private ImageView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = (TextView) findViewById(R.id.welcome_id);
        a = (ImageView) findViewById(R.id.a_id) ;
        /*Animation anim = AnimationUtils.loadAnimation(this,R.anim.transition);
        welcome.startAnimation(anim);
        logo.startAnimation(anim);*/


        //welcome page delay handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        } , SPLASH_TIME_OUT);
    }
}




