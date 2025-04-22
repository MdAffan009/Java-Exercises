package Finding_The_Area;

import java.util.Scanner;

class algorithm {

    public int length;
    public int width;
    static int area;

    public algorithm(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int Area() {

        area = length * width;

        System.out.println(area);

        return area;

    }

    public static int DoubleArea() {
        return area * area;
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

        algorithm algo = new algorithm(length, breadth);
        algo.Area();

        int doubleArea = algorithm.DoubleArea();

        System.out.print(doubleArea);

    }

}
