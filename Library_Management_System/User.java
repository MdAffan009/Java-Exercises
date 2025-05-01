package Library_Management_System;

import java.util.Scanner;

public class User {

    final private String name;
    final private String email;
    private int borrowedBookCount;

    public User(String name, String email, int borrowedBookCount) {
        this.name = name;
        this.email = email;
        this.borrowedBookCount = borrowedBookCount;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Books Borrowed: " + borrowedBookCount);
        System.out.println();
    }

    public void borrow(Scanner input, Library lib) {

        System.out.println("Which Type of book do you want?");
        System.out.println("Ebook or Printed Book?");
        String type = input.nextLine().trim().toLowerCase();

        switch (type) {
            case "ebook" -> {
                System.out.println();

                lib.displayEBooks();

                System.out.println("Among them, Which book do you want?");
                System.out.println("Enter the Book ID: ");
                int bookId = input.nextInt();

                if (lib.Ebooks.containsKey(bookId)) {

                    Borrowable selectedBook = lib.Ebooks.get(bookId);

                    selectedBook.Borrow();
                    borrowedBookCount++;

                }

                else {
                    System.out.println("Invalid Book ID.");
                }

            }

            case "printed book" -> {
                System.out.println();

                lib.displayPrintedBooks();

                System.out.println("Among them, Which book do you want?");
                System.out.println("Enter the Book ID: ");
                int bookId = input.nextInt();

                if (lib.printedBooks.containsKey(bookId)) {

                    Borrowable selectedBook = lib.printedBooks.get(bookId);

                    selectedBook.Borrow();
                    borrowedBookCount++;
                }

                else {
                    System.out.println("Invalid Book ID.");
                }

            }

            default -> {
                System.out.println("Invalid type. It should be either Ebook or Printed Book.");
                System.out.println("Try Again.\n");
                borrow(input, lib);
            }
        }

    }

}
