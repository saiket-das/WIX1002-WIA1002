package WIX1002.Labs.Lab_6;

import java.util.Scanner;

/*
    Write a Java method that implements Euclidean Algorithm to return the greatest
    common divisor of two positive integers. Then, write a program to get the GCD for
    (24, 8) and (200, 625).
*/

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD of (" + a + ", " + b + ") is: " + gcd(a, b));
        sc.close();
    }

    // Find the greatest common divisor of two integers using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

            System.out.println("a: " + a + " b: " + b);
        }
        System.out.print("\n");
        return a;
    }

}

/*
 * 1st:
 * a = 200, b = 625
 * -> b = 200 (a % b -> 200 % 625 = 200)
 * -> a = 625, b = 200 (a = b (b is old value here. i.e. b = 200))
 * 
 * 2nd:
 * a = 625, b = 200
 * -> b = 25 (a % b -> 625 % 200 = 4)
 * -> a = 200, b = 25 (a = b (b is old value here))
 * 
 * 2nd:
 * a = 200, b = 25
 * -> b = 0 (a % b -> 200 % 25 = 0)
 * -> a = 25, b = 0 (a = b (b is old value here))
 * 
 * b == 0, so answer is a = 25 which gcd of (200, 625)
 */
