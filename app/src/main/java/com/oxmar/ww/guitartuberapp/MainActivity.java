package com.oxmar.ww.guitartuberapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends Activity implements View.OnClickListener {

    private MediaPlayer player;
    private Button btnE;
    private Button btnB;
    private Button btnG;
    private Button btnD;
    private Button btnA;
    private Button btnE2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnE = (Button) findViewById(R.id.idBtnE);
        btnA = (Button) findViewById(R.id.idBtnA);
        btnD = (Button) findViewById(R.id.idBtnD);
        btnG = (Button) findViewById(R.id.idBtnG);
        btnB = (Button) findViewById(R.id.idBtnB);
        btnE2 = (Button) findViewById(R.id.idBtnE2);

        btnE.setOnClickListener(this);
        btnA.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnG.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnE2.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.idBtnE:
                playsound(1);
                break;
            case R.id.idBtnA:
                playsound(2);
                break;
            case R.id.idBtnD:
                playsound(3);
                break;
            case R.id.idBtnG:
                playsound(4);
                break;
            case R.id.idBtnB:
                playsound(5);
                break;
            case R.id.idBtnE2:
                playsound(6);
                break;
        }

    }

    private void playsound(int i) {
        // TODO auto generate method stub
        try {
            if (player.isPlaying()) {
                player.stop();
                player.prepare();
            }
        } catch (Exception e) {

        }
        switch (i) {
            case 1:
                player = MediaPlayer.create(this, R.raw.e_tune);
                break;
            case 2:
                player = MediaPlayer.create(this, R.raw.a_tune);
                break;
            case 3:
                player = MediaPlayer.create(this, R.raw.d_tune);
                break;
            case 4:
                player = MediaPlayer.create(this, R.raw.g_tune);
                break;
            case 5:
                player = MediaPlayer.create(this, R.raw.b_tune);
                break;
            case 6:
                player = MediaPlayer.create(this, R.raw.e2_tune);
                break;
        }
        player.start();
    }

    public void onPause() {
        try {
            super.onPause();
            player.pause();
        } catch (Exception e) {

        }
    }

    public void onStop() {
        super.onStop();
        player.stop();
    }
}
