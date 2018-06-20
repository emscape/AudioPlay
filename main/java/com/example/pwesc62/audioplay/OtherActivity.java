package com.example.pwesc62.audioplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        // Create a list of Books
        final ArrayList<Book> Books = new ArrayList<>();
        Books.add(new Book("Robert Heinlein", "6xH", R.drawable.six_x_h));
        Books.add(new Book("Martin H. Greenberg", "Cat Crimes for the Holidays", R.drawable.cat_crimes));
        Books.add(new Book("Christopher Golden", "Chaos Bleeds", R.drawable.chaos_bleeds));
        Books.add(new Book("Steve Barry", "The Charlemagne Pursuit", R.drawable.charlemangne_pursuit));
        Books.add(new Book("John Grisham", "The Chamber", R.drawable.chamber));


        // Create an {@link BookAdapter}, whose data source is a list of {@link Book}s. The
        // adapter knows how to create list items for each item in the list.
        final BookAdapter adapter = new BookAdapter(this, Books, R.color.colorEveDallas);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Book_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link BookAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Book} in the list.
        listView.setAdapter(adapter);


    }
}


