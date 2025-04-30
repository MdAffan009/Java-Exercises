package Library_Management_System;

public class User {

    private String name;
    private String email;
    private int borrowedBookCount;

    public User(String name, String email, int borrowedBookCount) {
        this.name = name;
        this.email = email;
        this.borrowedBookCount = borrowedBookCount;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBorrowedBookCount() {
        return borrowedBookCount;
    }

    //Setters

}
