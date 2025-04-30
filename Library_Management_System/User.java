package Library_Management_System;

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

    public void borrow() {
        Library lib = new Library();

        lib.initializeBooks();
        lib.displayBook();

    }

}
