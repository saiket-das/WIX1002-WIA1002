package past_years.WIX1002_2024;

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        // count();
        sum();
    }

    // Question 1 - a
    public static void count() {
        Scanner input = new Scanner(System.in);

        int positive = 0, neagtive = 0;
        System.out.print("Enter numbers: ");
        while (true) {
            char number = input.next().charAt(0);

            if (number == 'X' || number == 'x') {
                break;
            } else if ((int) number - '0' < 0) {
                neagtive++;
            } else {
                positive++;
            }
        }
        System.out.println("Total positive: " + positive);
        System.out.println("Total neagtive: " + neagtive);

        input.close();
    }

    // Question 1 - b
    public static void sum() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1 / (double) i);
        }
        System.out.printf("Total positive: %.3f\n", sum);

        input.close();
    }
}