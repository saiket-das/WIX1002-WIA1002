package WIX1002.Vivas.Viva_1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Prime check
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            // Non-prime number analysis
            System.out.println("Integer is not a prime number, it has " + getFactorsCount(n) + " factors.");
            printFactors(n);
            long sum = sumOfFactors(n);
            System.out.println("The sum of the factors is " + sum);
            checkProductOfFactors(n);
            checkPerfectNumber(n);
            printPrimesUpTo(n);
        }

        sc.close();
    }

    // Prime check method
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Factor count method
    public static int getFactorsCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Method to print the factors
    public static void printFactors(int n) {
        System.out.print("The factors of this integer are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Sum of factors method
    public static long sumOfFactors(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to handle the product of factors and check for overflow
    public static void checkProductOfFactors(int n) {
        long product = 1;
        boolean overflow = false;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                product *= i;
                if (product > Long.MAX_VALUE / i) { // Detect overflow
                    overflow = true;
                    break;
                }
            }
        }

        if (overflow) {
            System.out.println("The product of the factors is too large to display");
        } else {
            System.out.println("The product of the factors is " + product);
        }
    }

    // Method to check if the number is a perfect number
    public static void checkPerfectNumber(int n) {
        long sumOfProperDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfProperDivisors += i;
            }
        }
        if (sumOfProperDivisors == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }

    // Method to print prime numbers less than n
    public static void printPrimesUpTo(int n) {
        System.out.print("Prime numbers between 2 and " + n + ": ");
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
