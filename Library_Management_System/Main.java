package Library_Management_System;

import java.util.Scanner;

@SuppressWarnings("ConvertToTryWithResources")

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String name = input.nextLine();

        System.out.println("Enter Your Email: ");
        String email = input.nextLine();

        User user = new User(name, email, 0);

        // user.showInfo();
        user.borrow(input);

        input.close();

    }
}
