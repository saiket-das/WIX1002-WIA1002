package WIX1002.Labs.Lab_3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter 'b': ");
        int b = sc.nextInt();
        System.out.print("Enter 'c': ");
        int c = sc.nextInt();
        System.out.print("Enter 'd': ");
        int d = sc.nextInt();
        System.out.print("Enter 'e': ");
        int e = sc.nextInt();
        System.out.print("Enter 'f': ");
        int f = sc.nextInt();

        double x = 0, y = 0;
        int no_solution = (a * d - b * c);
        if (no_solution == 0) {
            System.out.println("The equation has no solution");
        } else {
            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.println("x: " + String.format("%.2f", x) + "  y: " + String.format("%.2f", y));

        }

        sc.close();
    }
}
