package viva.viva_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(ISBNValidator(str));
        sc.close();
    }

    public static boolean ISBNValidator(String isbn) {
        int total = 0;

        if (isbn.length() != 10) {
            return false;
        }

        for (int i = 0; i < 9; i++) {
            int digit = isbn.charAt(i) - '0';
            total += digit * (i + 1);
        }

        total %= 11;
        System.out.printf("Total(After mod): %d ", total);

        int lastDigit;
        if (isbn.charAt(9) == 'X')
            lastDigit = 10;
        else {
            lastDigit = isbn.charAt(9) - '0';
            System.out.printf("and Last digit: %c %n", isbn.charAt(9));
        }

        if (total == lastDigit)
            return true;
        else
            return false;
    }
}

/*
 * Testcase:
 * 0471958697: True
 * 123456789X: True
 * 1234567890: False
 */