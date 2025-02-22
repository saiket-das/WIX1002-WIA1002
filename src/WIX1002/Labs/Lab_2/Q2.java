package WIX1002.Labs.Lab_2;

import java.util.Scanner;

/*
 P The price of the car
 D Down payment
 M Monthly Payment 
 R Interest Rate in %
 Y Loan duration in year
 */

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Car price input (P)
        System.err.print("Enter your car price: ");
        double p = sc.nextDouble();

        // Down payment input (D)
        System.err.print("Enter your down payment: ");
        double d = sc.nextDouble();

        // Interest rate input (R)
        System.err.print("Enter your interest rate: ");
        double r = sc.nextDouble();

        // Loan duration in Year input (Y)
        System.err.print("Enter your load duration: ");
        double y = sc.nextDouble();

        // Monthly payment input (M)
        double m = ((p - d) * (1 + r * y / 100)) / (y * 12);
        System.out.println("The monthly payment for car loan: " + String.format("%.2f", m));

        sc.close();
    }
}
