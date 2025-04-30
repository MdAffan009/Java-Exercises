package Library_Management_System;

import java.util.HashMap;

public class Library {

    private final HashMap<Integer, Book> books = new HashMap<>();
    private int Id = 100;

    
    public void initializeBooks() {
        Book eBook = new EBook("American Psycho", "Bret Easton Ellis", 500);
        Book eBook2 = new EBook("The Shining", "Stephen King", 800);

        Book printedBook = new PrintedBooks("Crimes and Punishment", "Fyodor Dostoevsky", 3);
        Book printedBook2 = new PrintedBooks("The Stranger", "Albert Camus", 9);

        addBook(eBook);
        addBook(eBook2);

        addBook(printedBook);
        addBook(printedBook2);
    }

    private void addBook(Book book) {
        books.put(Id, book);
        Id++;
    }

    public void displayBook() {

        for (Book book : books.values()) {
            book.bookInfo();
            System.out.println("---------------------------");
        }
    }

}
