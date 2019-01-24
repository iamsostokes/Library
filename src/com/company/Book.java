package com.company;

public class Book {
    private String title;
    private String genre;
    private int numberOfPages;
    private boolean completedReading;

    public Book (String title, String genre, int numberOfPages, boolean completedReading) {
       this.title = title;
       this.genre = genre;
       this.numberOfPages = numberOfPages;
       this.completedReading = completedReading;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isCompletedReading() {
        return completedReading;
    }

    public void setCompletedReading(boolean completedReading) {
        this.completedReading = completedReading;
    }
}
