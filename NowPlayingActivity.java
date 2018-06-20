package com.example.pwesc62.audioplay;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_layout);

        //find the view that holds the title
        TextView np_title = findViewById(R.id.np_title);

        //set the title - ideally this would come from a list item
        np_title.setText(R.string.title);

        //find the view that holds the author
        TextView np_author = findViewById(R.id.np_author);

        //set the author - ideally this would come from a list item
        np_author.setText(R.string.author);

        //find the view for the book cover image
        ImageView np_cover = findViewById(R.id.np_book_cover);

        //set the book cover - ideally this would come from a list item
        Drawable np_cover_drawable = getResources().getDrawable(R.drawable.naked);
        np_cover.setImageDrawable(np_cover_drawable);

    }


}
