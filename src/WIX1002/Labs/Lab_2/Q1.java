package WIX1002.Labs.Lab_2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Take the input of temperature (fahrenheit)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature (F°): ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("Celsius(C°): " + String.format("%.2f", celsius));
        sc.close();
    }
}