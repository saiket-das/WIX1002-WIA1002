package past_years.WIX1002_2025;

import java.util.*;

public class Q1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Binary number: " + Q1_a());
        Q1_b();
    }

    // Question 1 - Decimal to Bianry
    public static int Q1_a() {

        // Number input
        System.out.print("Enter decimal number: ");
        int decimalNum = input.nextInt();

        System.out.println("Decimal number: " + decimalNum);

        // String to save binary numbers
        StringBuilder binaryString = new StringBuilder();
        while (decimalNum >= 1) {
            int remiander = decimalNum % 2;
            binaryString.append(remiander);
            decimalNum /= 2;
        }

        // 10 --> 0101 --> 1010
        binaryString.reverse();
        // String to Integer
        int binaryNum = Integer.parseInt(binaryString.toString());

        return binaryNum;
    }

    // Question b - Mark and grade calculate
    public static void Q1_b() {
        System.out.print("\nTotal number of courses: ");
        int n = input.nextInt();

        int[] marks = new int[n];

        // Course mark input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter course mark" + (i + 1) + " [0 - 100]: ");
            int courseMark = input.nextInt();
            if ((courseMark >= 0) && (courseMark <= 100)) {
                marks[i] = courseMark;
            } else {
                System.out.println("Invalid mark. Enter range between 0 to 100");
            }
        }

        // Find average
        double average = findAverage(marks, n);
        System.out.println("Average: " + average);
        // Find grade
        findGrade(average);
    }

    // Find average
    public static double findAverage(int[] marks, int n) {
        double totalMarks = 0;
        // Calculate total marks
        for (int i = 0; i < n; i++) {
            totalMarks += (double) marks[i];
        }

        // Calculate average
        double average = totalMarks / n;
        return average;
    }

    // Find grade from average
    public static void findGrade(double average) {
        int averagInt = (int) average / 10;

        System.out.print("Grader: ");
        switch (averagInt) {
            case 10:
            case 9:
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}

// 7 % 2 = 1
// 3 % 2 = 1
// 1 % 1 = 1

// 10 % 2 = 0
// 5 % 2 = 1
// 2 % 2 = 0
// 1 % 2 = 1
