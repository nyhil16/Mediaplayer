package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    MediaPlayer mp1;

    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.btnPlay);

    }

    public void reproducir(View view) {
        int zankyou = this.getResources().getIdentifier("aimer_zankyou_sanka", "raw", getPackageName());
        System.out.println("El entero de boots es " + zankyou);
        mp1 = MediaPlayer.create(this, zankyou);
        mp1.seekTo(0);
        mp1.start();

    }


}