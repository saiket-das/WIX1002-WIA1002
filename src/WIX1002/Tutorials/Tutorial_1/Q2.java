package WIX1002.Tutorials.Tutorial_1;

import java.util.Random;

// Determine whether a random number is greater than 50.
public class Q2 {
    public static void main(String[] args) {

        // Get the random number
        Random random = new Random();

        // Convert into integer
        int random_int = random.nextInt(100);

        // Check whether greater than 50
        if (random_int > 50) {
            System.out.println(random_int + " is greater than 50");
        } else {
            System.out.println(random_int + " is less than 50");
        }
    }
}
