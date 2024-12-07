package viva.viva_2;

import java.util.Scanner;

public class Q2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        main: while (true) {

            // Print options
            System.out.println("Choose the shape to calculate the area: ");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("0. Exit");

            // Choose one option
            System.out.print("Enter your choice: ");
            int choose = sc.nextInt();

            switch (choose) {
                // Circle
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    calculateCircleArea(radius);
                    continue main;

                // Rectangle
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    calculateRectangleArea(length, width);
                    continue main;

                // Triangle
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the radius of the triangle: ");
                    double height = sc.nextDouble();
                    calculateTriangleArea(base, height);
                    continue main;

                // Triangle
                case 0:
                    break main;
                default:
                    break;
            }
        }
    }

    // Calculate circle area
    public static void calculateCircleArea(double radius) {
        double area = radius * radius * Math.PI;
        System.out.printf("The area of the circle is: %.2f \n\n", area);
    }

    // Calculate rectangle area
    public static void calculateRectangleArea(double length, double width) {
        double area = length * width;
        System.out.printf("The area of the rectangle is: %.2f \n\n", area);
    }

    // Calculate triangle area
    public static void calculateTriangleArea(double base, double height) {
        double area = (base * height) / 2;
        System.out.printf("The area of the triangle is: %.2f \n\n", area);
    }
}
