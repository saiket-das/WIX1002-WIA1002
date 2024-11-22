package lab.lab_6;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        // Array input
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            numbers[i] = number;
        }

        // Reverse the integer in the array
        reverseElementOfArray(numbers);

        // Print answer
        printArray(numbers);
        sc.close();
    }

    // Reverse the integer in the array
    public static int[] reverseElementOfArray(int[] numbers) {
        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            int number = numbers[i];
            int newNumber = 0; // Save reversed number

            while (number != 0) {
                int digit = number % 10;
                number /= 10;
                newNumber = (newNumber * 10) + digit;
            }
            numbers[i] = newNumber;
        }

        return numbers;
    }

    // Print Array
    public static void printArray(int[] numbers) {
        int len = numbers.length;

        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");
    }
}
