package tutorial.tutorial_6;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        // Answer (true | false)
        System.out.println(isPentagonal(a));
        sc.close();
    }

    public static boolean isPentagonal(int num) {
        for (int pen = 1, i = 1; pen <= num; i++) {
            pen = (i * (3 * i - 1)) / 2;
            if (pen == num)
                return true;
        }

        return false;
    }
}
