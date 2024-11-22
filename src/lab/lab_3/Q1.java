package lab.lab_3;
/*
 * Write a program that stimulates a simple calculator. It reads two integers
 * and a character. If the character is a +, the sum is printed; if it is a -,
 * the difference is printed; if is a *, the multiplication is printed; if it is
 * a /, the quotient is printed; and if it is a %, the remainder is printed.
 * (Use the String.charAt(0) to return the character)
 * 
 * Example:
 * Enter two integer number: 30 5
 * Enter the operend: /
 * 30 / 5 = 6
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);

        int result;
        switch (operand) {
            case ('+'):
                result = num1 + num2;
                answer(num1, num2, operand, result);
                break;
            case ('-'):
                result = num1 - num2;
                answer(num1, num2, operand, result);
                break;
            case ('*'):
                result = num1 * num2;
                answer(num1, num2, operand, result);
                break;
            case ('/'):
                result = num1 / num2;
                answer(num1, num2, operand, result);
                break;
            case ('%'):
                result = num1 % num2;
                answer(num1, num2, operand, result);
                break;
            default:
                System.out.println("You entered wrong operand!");
                break;
        }
        sc.close();

    }

    public static void answer(int num1, int num2, char operand, int result) {
        System.out.println(num1 + " " + operand + " " + num2 + " = " + result);
    }
}