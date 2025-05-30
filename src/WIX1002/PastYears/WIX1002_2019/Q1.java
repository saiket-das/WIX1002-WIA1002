package WIX1002.PastYears.WIX1002_2019;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(
                "This program shows the number of odd and even number from 10 random numbers. The random number must be from 0-100");
        int num, odd = 0, even = 0;
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            num = random.nextInt(0, 101);
            System.out.print(num + " ");
            if (isEven(num)) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("\nNumber of odd number: " + odd);
        System.out.println("Number of event number: " + even);
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
