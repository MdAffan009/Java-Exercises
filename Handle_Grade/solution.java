package Handle_Grade;

import java.util.Scanner;

class Student {
    int mathMarks;
    int englishMarks;
    int scienceMarks;

    public char grade;
    static int maximumMarks = 120;

    public Student(int mathMarks, int englishMarks, int scienceMarks) {
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
        this.scienceMarks = scienceMarks;

    }

    public int totalMarks() {

        return mathMarks + englishMarks + scienceMarks;
    }

    public int percentage() {
        return (int) (((double) totalMarks() / maximumMarks) * 100);
    }

    public char grade() {
        if (percentage() > 90) {
            return grade = 'A' + '+';
        }

        else if (percentage() < 90 && percentage() > 80) {
            return grade = 'A';
        }

        else if (percentage() < 80 && percentage() > 70) {
            return grade = 'B';
        }

        else if (percentage() < 70 && percentage() > 60) {
            return grade = 'C';
        }

        else {
            return grade = 'F';
        }
    }

    public boolean isPass() {
        return percentage() > 60;
    }
}

public class Solution {

    @SuppressWarnings("ConvertToTryWithResources")

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your name");
        String name = input.nextLine();

        System.out.println("How many marks you have gained at Maths?");
        int mathMarks = input.nextInt();

        System.out.println("How many marks you have gained at English?");
        int englishMarks = input.nextInt();

        System.out.println("How many marks you have gained at Science?");
        int scienceMarks = input.nextInt();

        input.close();

        Student student = new Student(mathMarks, englishMarks, scienceMarks);

        System.out.println("You got " + student.totalMarks() + " marks in total");

        System.out.println("You got " + student.percentage() + " %");

        System.out.println("You got " + student.grade() + " Grade");

        if (student.isPass()) {
            System.out.println(name + " ,You have been promoted to next grade!");
        }

        else {
            System.out.println(name + " ,You have been detained in this grade!");
        }

    }

}
