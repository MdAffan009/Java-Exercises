package Library_Management_System;

import java.util.Scanner;

public class User {

    final private String name;
    final private String email;
    final private int borrowedBookCount;

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

    public void borrow(Scanner input) {

        Library lib = new Library();
        lib.initializeBooks();

        System.out.println("Which Type of book do you want?");
        System.out.println("Ebook or Printed Book?");
        String type = input.nextLine().trim().toLowerCase();

        
        switch (type) {
            case "ebook" -> {
                System.out.println("You selected Ebook.");

            }

            case "printed book" -> {
                System.out.println("You selected Printed Book.");

            }

            default -> {
                System.out.println("Invalid type. It should be either Ebook or Printed Book.");
                System.out.println("Try Again.\n");
                borrow(input);
            }
        }

    }

}
