package tutorial.tutorial_6;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();

        int max = maximum(a, b, c);
        System.out.println("Maximum number is: " + max);

        sc.close();
    }

    public static int maximum(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }
}