package WIX1002.Labs.Lab_2;

import java.util.Random;

public class Q5 {
    public static void main(String[] args) {

        // 1234
        // 4 + 3 + 2 + 1 = 10
        Random random = new Random();
        int randomNum = random.nextInt(0, 10001);
        System.out.println("Random number: " + randomNum);

        int sum = 0;
        while (randomNum != 0) {
            sum += randomNum % 10;
            randomNum /= 10;
        }

        System.out.println("Sum of all the digits: " + sum);

    }
}
