package com.example.loginsignuprealtime;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;
    private String videoUrl = "https://cdn.flowplayer.com/a30bd6bc-f98b-47bc-abf5-97633d4faea0/hls/de3f6ca7-2db3-4689-8160-0f574a5996ad/playlist.m3u8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(videoUrl));
        videoView.start();
        Button logoutButton = (Button) findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

        CardView aboutusCardView = (CardView) findViewById(R.id.aboutus);
        aboutusCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutus();
            }
        });

        CardView archivesCardView = (CardView) findViewById(R.id.archives);
        archivesCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                archives();
            }
        });
    }

    private void logout() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private void aboutus() {
        Intent intent = new Intent(this, Aboutus.class);
        startActivity(intent);
    }

    private void archives() {
        Intent intent = new Intent(this, Archives.class);
        startActivity(intent);
    }
}
