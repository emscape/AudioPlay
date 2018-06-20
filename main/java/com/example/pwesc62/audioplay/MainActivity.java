package com.example.pwesc62.audioplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the eve category
        TextView nowPlaying = findViewById(R.id.now_playing);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the eve category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link eveActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the eve category
        TextView eve = findViewById(R.id.eve);

        // Set a click listener on that View
        eve.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the eve category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link eveActivity}
                Intent eveIntent = new Intent(MainActivity.this, EveActivity.class);

                // Start the new activity
                startActivity(eveIntent);
            }
        });

        // Find the View that shows the dune category
        TextView dune = findViewById(R.id.dune);

        // Set a click listener on that View
        dune.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the dune category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link duneActivity}
                Intent duneIntent = new Intent(MainActivity.this, DuneActivity.class);

                // Start the new activity
                startActivity(duneIntent);
            }
        });

        // Find the View that shows the other category
        TextView other = findViewById(R.id.other);

        // Set a click listener on that View
        other.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the other category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link otherActivity}
                Intent otherIntent = new Intent(MainActivity.this, OtherActivity.class);

                // Start the new activity
                startActivity(otherIntent);
            }
        });
    }
}
