package WIX1002.PastYears.WIX1002_2018;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = 0, sum = 0;

        do {
            System.out.print("Enter an intger number, -1 to quit: ");
            num = input.nextDouble();
            if (num == -1) {
                continue;
            }
            // Find even or odd number
            if (num % 2 == 0) {
                System.out.println("This is even number");
            } else {
                System.out.println("This is odd number");
            }
            sum += num;
        } while (num != -1);

        System.out.printf("The suum of all intger number(s) is: %.5f \n", sum);

        input.close();

    }
}
