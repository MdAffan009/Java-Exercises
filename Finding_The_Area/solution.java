package Finding_The_Area;

import java.util.Scanner;

class Rectangle {

    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {

        return length * width;

    }

    public int Doublearea() {

        return 2 * area();
    }

}

public class solution {



    @SuppressWarnings("ConvertToTryWithResources")


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter Breadth: ");
        int breadth = input.nextInt();

        input.close();

        Rectangle rect = new Rectangle(length, breadth);
        
        System.out.println("Orignal Area: " + rect.area());
        System.out.println("Doubled Area: " + rect.Doublearea());
       

    }

}
