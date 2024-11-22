package tutorial.tutorial_6;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        // Answer
        System.out.println(isSquare(a));
        sc.close();
    }

    public static boolean isSquare(int num) {
        int i = 1;
        while (i * i <= num) {
            if (i * i == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}
