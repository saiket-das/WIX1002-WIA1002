package WIX1002.Vivas.Viva_1;

import java.util.Scanner;

public class Q2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int step = 0;

        while (n > 1) { // Continue until n becomes 1
            if (n % b == 0) {
                n /= b;
            } else if (n - a > 0) {
                n -= a;
            } else {
                // If n is less than a and not divisible by b, we can't reach 1
                step = -1;
                break;
            }
            step++;
        }
        // Print answer
        System.out.println(step);
        sc.close();
    }
}

// 15 3 (5) 1
// 15 / 5 = 3
// 3 + 1 = 4
// 4 - 3 = 1

// 15 3 5 2
// 15 / 5 = 3
// 3 + 2 = 5
// 5 / 5