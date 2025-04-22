import java.util.Scanner;

class Algorithm {

    public static int Average(int a, int b, int c) {

        int ans = a + b + c;

        return ans / 3;
    }

}

public class Solution {

    // To supress the warning
    @SuppressWarnings("ConvertToTryWithResources")

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers to find average");

        System.out.print("Enter First Number: ");
        int a = input.nextInt();

        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        System.out.print("Enter Third Number: ");
        int c = input.nextInt();

        input.close();

        int avg = Algorithm.Average(a, b, c);

        System.out.print(avg);

    }

}
