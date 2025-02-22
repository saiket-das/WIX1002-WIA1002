package WIX1002.PastYears.WIX1002_2018;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter N number: ");
        int n = input.nextInt();

        int aaa = 0, aa = 0, a = 0;
        System.out.print("The random numbers are: ");
        while (n > 0) {
            // Generate number between (50 - 150)
            int randomNum = random.nextInt(50, 151);
            System.out.print(randomNum + " ");
            // Extract the last digit
            int digit = randomNum % 10;

            // Group the last digit
            if (0 >= digit || digit <= 3) {
                aaa++;
            } else if (4 >= digit || digit <= 6) {
                aa++;
            } else if (7 >= digit || digit <= 9) {
                a++;
            }
            n--;
        }

        // Output
        System.out.println("\nGroup AAA: " + aaa);
        System.out.println("Group AA: " + aa);
        System.out.println("Group A: " + a);

        input.close();
    }
}

/*
 * 0 - 3 --> AAA
 * 4 - 6 --> AA
 * 7 - 9 --> A
 * 
 * AAA = 4, AA = 2, A = 6
 * 12[4], 9[1], 11[1]
 */