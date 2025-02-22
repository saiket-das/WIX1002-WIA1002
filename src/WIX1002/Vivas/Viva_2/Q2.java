package WIX1002.Vivas.Viva_2;

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
            System.out.println("4. Trapezium");
            System.out.println("0. Exit");

            // Choose one option
            System.out.print("Enter your choice: ");
            int choose = sc.nextInt();

            switch (choose) {
                // Circle
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    double circleArea = calculateCircleArea(radius);

                    System.out.printf("The area of the circle is: %.2f \n\n", circleArea);
                    continue main;

                // Rectangle
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();

                    double rectangleArea = calculateRectangleArea(length, width);
                    System.out.printf("The area of the rectangle is: %.2f \n\n", rectangleArea);
                    continue main;

                // Triangle
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the radius of the triangle: ");
                    double height = sc.nextDouble();

                    double triangleArea = calculateTriangleArea(base, height);
                    System.out.printf("The area of the triangle is: %.2f \n\n", triangleArea);
                    continue main;

                // Trapezium
                case 4:
                    System.out.print("Enter the a of the trapezium: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter the b of the trapezium: ");
                    double b = sc.nextDouble();

                    System.out.print("Enter the height of the trapezium: ");
                    double h = sc.nextDouble();

                    double trapeziumeArea = calculateTrapeziumArea(a, b, h);
                    System.out.printf("The area of the trapezium is: %.2f \n\n", trapeziumeArea);
                    continue main;

                // Exit
                case 0:
                    break main;
                default:
                    break;
            }
        }
    }

    // Calculate circle area
    public static double calculateCircleArea(double radius) {
        double area = radius * radius * Math.PI;
        return area;
    }

    // Calculate rectangle area
    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    // Calculate triangle area
    public static double calculateTriangleArea(double base, double height) {
        double area = (base * height) / 2;
        return area;
    }

    // Trapezium
    public static double calculateTrapeziumArea(double a, double b, double h) {
        double area = ((a + b) / 2) * h;
        return area;
    }
}
