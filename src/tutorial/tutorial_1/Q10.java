package tutorial.tutorial_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Display the number of female student from a random list of 100 students.
public class Q10 {
    public static void main(String[] args) {
        Random random = new Random();

        // Create a list to store genders of students
        List<String> studentGenders = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String gender = random.nextBoolean() ? "F" : "M";
            studentGenders.add(gender);
        }

        // Count total female
        int count = 0;
        for (String gender : studentGenders) {
            if (gender.equals("F")) {
                count++;
            }
        }
        System.out.println("Total number of female student: " + count);
    }
}
