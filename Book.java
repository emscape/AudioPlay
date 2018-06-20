package com.example.pwesc62.audioplay;

public class Book {

    //String for Book title
    private String mTitle;

    //String for Author
    private String mAuthor;

    //image for the Book cover
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Constant value that represents no image was provided for this Book
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor for a Book object.
     *
     * @param title  -- Title of the book
     * @param author -- Author of the book
     */
    public Book(String title, String author) {
        mTitle = title;
        mAuthor = author;

    }

    /**
     * Create a new Book object.
     *
     * @param author          is the Book in a language that the user is already familiar with
     *                        (such as English)
     * @param title           is the Book in the title language
     * @param imageResourceId is the drawable resource ID for the image associated with the Book
     */
    public Book(String author, String title, int imageResourceId) {
        mAuthor = author;
        mTitle = title;
        mImageResourceId = imageResourceId;
    }


    //Method for populating book title
    public String getTitle() {
        return mTitle;
    }

    //Method for populating book author
    public String getAuthor() {
        return mAuthor;
    }

    // Method for populating the book cover
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Returns if there's a book cover image for the book
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}


