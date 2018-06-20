package com.example.pwesc62.audioplay;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link BookAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Book} objects.
 */
public class BookAdapter extends ArrayAdapter<Book>  {

    /** Resource ID for the background color for this list of Books */
    private int mColorResourceId;

    /**
     * Create a new {@link BookAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param Books is the list of {@link Book}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of Books
     */
    public BookAdapter(Context context, ArrayList<Book> Books, int colorResourceId) {
        super(context, 0, Books);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Book} object located at this position in the list
        Book currentBook = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        // Get the title  from the currentBook object and set this text on
        // the title TextView.
        titleTextView.setText(currentBook.getTitle());

        // Find the TextView in the list_item.xml layout with the ID author_text_view.
        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        // Get the author  from the currentBook object and set this text on
        // the author TextView.
        authorTextView.setText(currentBook.getAuthor());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Check if an image is provided for this Book or not
        if (currentBook.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentBook.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;


    }
}