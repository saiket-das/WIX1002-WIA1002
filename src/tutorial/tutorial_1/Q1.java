package tutorial.tutorial_1;

import java.util.Scanner;

// Request two numbers from the user and print the multiplication of the numbers.
public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Two number input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculate multiplication
        int multiple = a * b;

        // Print answer
        System.out.println("Multiplication: " + multiple);
        sc.close();
    }
}
