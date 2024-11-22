package lab.lab_6;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = sc.next().charAt(0);

        multiPrint(n, c);
        sc.close();
    }

    public static void multiPrint(int n, char c) {
        // Draw triangle
        System.out.println("\nTriangle");
        printTriangle(n, c);

        // Draw diamond
        System.out.println("\nDiamond");
        printDiamond(n, c);
    }

    public static void printTriangle(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n - (n / 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.print("\n");
        }
    }

    public static void printDiamond(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n - (n / 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.print("\n");
        }
        for (int i = n; i > 0; i--) {
            for (int j = i - 2; j <= n - (n / 2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(c + " ");
            }

            System.out.print("\n");
        }
    }
}