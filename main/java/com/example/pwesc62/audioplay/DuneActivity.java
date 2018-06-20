package com.example.pwesc62.audioplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class DuneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        // Create a list of Books
        final ArrayList<Book> Books = new ArrayList<>();
        Books.add(new Book("Frank Herbert", "Dune", R.drawable.dune));
        Books.add(new Book("Frank Herbert", "Children of Dune", R.drawable.children_of_dune));
        Books.add(new Book("Frank Herbert", "Dune Messiah", R.drawable.dune_messiah));
        Books.add(new Book("Frank Herbert", "God Emperor of Dune", R.drawable.god_emperor_of_dune));
        Books.add(new Book("Frank Herbert", "Heretics of Dune", R.drawable.heretics_of_dune));
        Books.add(new Book("Frank Herbert", "The Godmakers", R.drawable.godmakers));



        // Create an {@link BookAdapter}, whose data source is a list of {@link Book}s. The
        // adapter knows how to create list items for each item in the list.
        final BookAdapter adapter = new BookAdapter(this, Books, R.color.colorDune);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Book_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link BookAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Book} in the list.
        listView.setAdapter(adapter);


    }
}


