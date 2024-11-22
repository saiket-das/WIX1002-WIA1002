package tutorial.tutorial_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Display a list of 5 random numbers in descending order. (Sort)
public class Q11 {
    public static void main(String[] args) {
        Random random = new Random();

        // Create a list to store numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(10));
        }

        // Sort the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        // Print numbers in descending order
        System.out.println(numbers);

    }
}
