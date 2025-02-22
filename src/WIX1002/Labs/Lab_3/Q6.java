
package WIX1002.Labs.Lab_3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Radius input (r)
        System.out.print("Enter the radius of circle: ");
        int r = sc.nextInt();

        System.out.print("Enter the coordinate point (x,y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Calculate distance (d)
        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (d < r) {
            System.out.println("The point is inside the circle.");
        } else if (d == r) {
            System.out.println("The point is on the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }

        sc.close();
    }
}
