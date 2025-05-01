package Library_Management_System;

interface Borrowable {

    boolean isAvailable();

    void Borrow();
}

public abstract class Book {

    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @SuppressWarnings("unused")
    abstract String bookType();

    public void bookInfo() {
        System.out.println("Title :" + title);
        System.out.println("Author :" + author);
    }

}

class EBook extends Book implements Borrowable {

    final private int fileSize;
    final private boolean serverDown = false;

    public EBook(String title, String author, int fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    String bookType() {

        return "EBook";

    }

    @Override
    public void bookInfo() {

        super.bookInfo();

        System.out.println("Type: " + bookType());
        System.out.println("File Size: " + fileSize);

    }

    @Override
    public boolean isAvailable() {
        return serverDown == false;
    }

    @Override
    public void Borrow() {

        if (!isAvailable()) {
            System.out.println("Sorry, The server is down");
            return;
        }

        System.out.println("\nWe'll send the EBook on your Email");
        

    }

}

class PrintedBooks extends Book implements Borrowable {
    final private int quantity;

    public PrintedBooks(String title, String author, int quantity) {
        super(title, author);
        this.quantity = quantity;
    }

    @Override
    String bookType() {

        return "Printed Books";

    }

    @Override
    public void bookInfo() {

        super.bookInfo();

        System.out.println("Type: " + bookType());
        System.out.println("Quantity: " + quantity);

    }

    @Override
    public boolean isAvailable() {

        return quantity > 0;

    };

    @Override
    public void Borrow() {
        if (!isAvailable()) {
            System.out.println("Sorry, The book is out of stocks");
            return;
        }

        System.out.println("You can take this book from the counter");
    }

}