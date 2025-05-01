package Library_Management_System;

import java.util.HashMap;

public class Library {

    public final HashMap<Integer, EBook> Ebooks = new HashMap<>();

    public final HashMap<Integer, PrintedBooks> printedBooks = new HashMap<>();

    private int Id = 1;

    public void initializeEBooks() {
        Book eBook = new EBook("American Psycho", "Bret Easton Ellis", 500);
        Book eBook2 = new EBook("The Shining", "Stephen King", 800);

        addEBook(eBook);
        addEBook(eBook2);
    }

    public void initializePrintedBooks() {

        Book printedBook = new PrintedBooks("Crimes and Punishment", "Fyodor Dostoevsky", 3);
        Book printedBook2 = new PrintedBooks("The Stranger", "Albert Camus", 9);

        addPrintedBook(printedBook);
        addPrintedBook(printedBook2);

    }

    private void addEBook(Book book) {
        Ebooks.put(Id, (EBook) book);
        Id++;
    }

    private void addPrintedBook(Book book) {
        printedBooks.put(Id, (PrintedBooks) book);
        Id++;
    }

    public void displayEBooks() {

        for (var entry : Ebooks.entrySet()) {

            int id = entry.getKey();
            Book book = entry.getValue();

            System.out.println("ID: " + id);
            book.bookInfo();

            System.out.println("---------------------------");
        }
    }

    public void displayPrintedBooks() {

        for (var entry : printedBooks.entrySet()) {
            int id = entry.getKey();
            Book book = entry.getValue();

            System.out.println("ID: " + id);
            book.bookInfo();

            System.out.println("---------------------------");
        }
    }

}
