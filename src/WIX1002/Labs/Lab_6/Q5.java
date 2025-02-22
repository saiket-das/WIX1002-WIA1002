package WIX1002.Labs.Lab_6;

import java.util.Random;
import java.util.Scanner;

/*
    Write a Java method that accepts three parameters, the method will compare whether
    the third parameter value is equal to the multiplication of parameter 1 and parameter 2. 
    Then, write a Java multiplication game for any random number within 0 – 12.
*/

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int a, b, c = 0, score = 0;
        while (c >= 0) {
            a = ran.nextInt(0, 13);
            b = ran.nextInt(0, 13);

            System.out.println("Enter negative number to quit.");
            System.out.print(a + " * " + b + " = ");
            c = sc.nextInt();

            if (checkMultiplication(a, b, c)) {
                score++;
            }
        }

        System.out.println("Your score: " + score);
        sc.close();
    }

    public static boolean checkMultiplication(int a, int b, int c) {
        if (a * b == c)
            return true;
        else
            return false;
    }
}
