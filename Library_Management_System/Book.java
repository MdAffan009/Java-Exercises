package Library_Management_System;


interface Borrowable {
    boolean isAvailable();
    void Borroe();
}


abstract class Book {

    private final String title;
    private final String author;

    private int quantity;

    public Book(String title, int quantity, String author) {
        this.title = title;
        this.quantity = quantity;
        this.author = author;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


