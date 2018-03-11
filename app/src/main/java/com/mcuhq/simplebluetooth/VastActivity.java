package com.mcuhq.simplebluetooth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VastActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView vastsss,vastddd,play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vast);

        //set reference to every card
        vastsss = (ImageView) findViewById(R.id.vastsss_id);
        vastddd = (ImageView) findViewById(R.id.vastddd_id);
        play = (ImageView) findViewById(R.id.play_id);
        //set click
        vastsss.setClickable(true);
        vastddd.setClickable(true);
        play.setClickable(true);
        //add click listener
        vastsss.setOnClickListener(this);
        vastddd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch ( view.getId()) {
            case R.id.vastsss_id : i = new Intent(this, PerSongActivity.class); startActivity(i) ; break;
            case R.id.vastddd_id : i = new Intent(this, BTActivity.class); startActivity(i) ; break;
            default: break;
        }

    }
}
