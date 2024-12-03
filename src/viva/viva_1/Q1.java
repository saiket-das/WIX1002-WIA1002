package viva.viva_1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate single digit using different loop structures
        int result = differnetLoop(number);

        System.out.println("Sum of digits: " + result);
        scanner.close();

    }

    public static int differnetLoop(int number) {
        int doubleDigitSum = number;
        while (number >= 10) {
            int singleDigitsum = 0;
            while (number > 0) {
                singleDigitsum += number % 10;
                number /= 10;
            }

            if (singleDigitsum >= 10) {
                doubleDigitSum = singleDigitsum;
            }
            number = singleDigitsum;
            System.out.println("Ddouble: " + doubleDigitSum + " Single: " + singleDigitsum);
        }
        if (number % 2 == 0) {
            number = doubleDigitSum;
        }
        return number;
    }

}

// 9876
// 9 + 8 + 7 + 6
// = 30
// 3 + 0

// 1235
// 1 + 2 + 3 + 5 == 11
// 2 // But need to print 11 instead of 2

// 9875
// 9 + 8 + 7 + 5
// 29
// 2 + 9
// 11
// 1 + 1
// 2
