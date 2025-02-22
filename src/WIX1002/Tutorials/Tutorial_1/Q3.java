package WIX1002.Tutorials.Tutorial_1;

import java.util.Scanner;

// Print the pass/fail grade based on the mark entered by user. The passing mark is at-least 40.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();

        if (mark < 40) {
            System.out.println("Failed");
        } else {
            System.out.println("Passed");
        }
        sc.close();
    }
}
