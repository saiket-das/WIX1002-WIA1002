package tutorial.tutorial_1;

import java.util.Scanner;

// Print the perimeter of a rectangle
public class Q5 {
    public static void main(String[] args) {

        // Width and Length input from user
        Scanner sc = new Scanner(System.in);
        // Width input
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        // Length input
        System.out.print("Enter width: ");
        double length = sc.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (width + length);

        // Print result
        System.out.println("The perimeter of a rectangle: " + perimeter);

        sc.close();
    }
}
