package com.example.pwesc62.audioplay;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class EveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        // Create a list of Books
        final ArrayList<Book> Books = new ArrayList<>();
        Books.add(new Book("J.D. Robb", "Naked in Death", R.drawable.naked));
        Books.add(new Book("J.D. Robb", "Glory in Death", R.drawable.glory));
        Books.add(new Book("J.D. Robb", "Immortal in Death", R.drawable.immortal));
        Books.add(new Book("J.D. Robb", "Rapture in Death", R.drawable.rapture));
        Books.add(new Book("J.D. Robb", "Ceremony in Death", R.drawable.ceremony));
        Books.add(new Book("J.D. Robb", "Vengeance in Death", R.drawable.vengeance));
        Books.add(new Book("J.D. Robb", "Holiday in Death", R.drawable.holiday));
        Books.add(new Book("J.D. Robb", "Midnight in Death", R.drawable.midnight));
        Books.add(new Book("J.D. Robb", "Conspiracy in Death", R.drawable.conspiracy));
        Books.add(new Book("J.D. Robb", "Loyalty in Death", R.drawable.loyalty));

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

        //I spent three days trying to make this inflate the now playing activity from the array list.
        //I left this in here because I would really appreciate some hints about how I could have actually done that
        //What I couldn't quite get was how to pass the information from the list to the NowPlayingActivity and then display it there.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nextActivity = new Intent(EveActivity.this, NowPlayingActivity.class);
                startActivity(nextActivity);
            }
        });
    }
}

