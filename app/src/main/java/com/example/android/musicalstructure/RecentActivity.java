package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class RecentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);

        // Find the View that shows the cover
        ImageView cover = (ImageView) findViewById(R.id.cover);
        // Set a click listener on  View
        cover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the cover View is clicked on.
            @Override
            public void onClick(View view) {
                Intent coverIntent = new Intent(RecentActivity.this, NowPlayingActivity.class);
                startActivity(coverIntent);
            }
        });
    }
}
