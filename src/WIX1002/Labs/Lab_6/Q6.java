package WIX1002.Labs.Lab_6;

import java.util.Scanner;

/*
    Write a Java method that determine whether a number is a palindromic prime and
    another method that determine whether a number is emirp (the number is a prime
    number and the reverse also a prime number and is not palindromic prime). Then,
    write a Java program to use the methods to display the first 20 palindromic prime and emirp.
*/

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Palindromic number
        if (isPrime(num) && isPalindromic(num))
            System.out.println(num + " is a palindromic prime number");
        else
            System.out.println(num + " is not a palindromic prime number");

        // Emirp number
        if (isPrime(num) && isEmirp(num))
            System.out.println(num + " is a emirp prime number");
        else
            System.out.println(num + " is not a emirp prime number");

        printPalindromicAndEmirp();
        sc.close();

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isPalindromic(int num) {

        int temp = num;
        int newNumber = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            temp /= 10;
            newNumber = newNumber * 10 + remainder;
        }
        ;
        if (newNumber == num)
            return true;

        return false;
    }

    public static boolean isEmirp(int num) {

        int temp = num;
        int newNumber = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            temp /= 10;
            newNumber = newNumber * 10 + remainder;
        }

        if (isPrime(newNumber) && !isPalindromic(newNumber))
            return true;

        return false;
    }

    public static void printPalindromicAndEmirp() {
        int totalP = 0, totalE = 0;

        int i = 2;

        System.out.println("\nFirst 20 Palindromic Primes:");
        while (totalP < 20) {
            if (isPrime(i) && isPalindromic(i)) {
                System.out.print(i + " ");
                totalP++;
            }
            i++;
        }

        i = 2;
        System.out.println("\n\nFirst 20 Emirp Primes:");
        while (totalE < 20) {
            if (isPrime(i) && isEmirp(i)) {
                System.out.print(i + " ");
                totalE++;
            }
            i++;
        }
        System.out.print("\n");
    }
}
