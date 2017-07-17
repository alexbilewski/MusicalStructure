package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the library etc. category
        ImageView library = (ImageView) findViewById(R.id.library);
        ImageView recent = (ImageView) findViewById(R.id.recent);
        ImageView podcast = (ImageView) findViewById(R.id.podcast);
        ImageView discover = (ImageView) findViewById(R.id.discover);
        ImageView cover = (ImageView) findViewById(R.id.cover);

        // Set a click listener on each View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });
        recent.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recent View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentIntent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(recentIntent);
            }
        });
        podcast.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the podcast View is clicked on.
            @Override
            public void onClick(View view) {
                Intent podcastIntent = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(podcastIntent);
            }
        });
        discover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the discover View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(MainActivity.this, DiscoverActivity.class);
                startActivity(discoverIntent);
            }
        });
        cover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the discover View is clicked on.
            @Override
            public void onClick(View view) {
                Intent coverIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(coverIntent);
            }
        });
        TextView playTxt = (TextView) findViewById(R.id.playTxt);
        playTxt.setMovementMethod(new ScrollingMovementMethod());
    }
}
