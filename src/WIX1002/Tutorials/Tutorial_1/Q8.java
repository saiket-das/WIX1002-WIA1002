package WIX1002.Tutorials.Tutorial_1;

import java.util.Scanner;

// Count the number of alphabet U and M from a sentence entered by user
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sentence input from user
        System.out.print("TYPE YOUR SENTENCWE (UPPERCASE): ");
        String sentence = sc.nextLine();

        // Count character 'U' & 'M' from sentence
        int countU = 0;
        int countM = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'U' || sentence.charAt(i) == 'u') {
                countU++;
            }
            if (sentence.charAt(i) == 'M' || sentence.charAt(i) == 'm') {
                countM++;
            }
        }

        // Print the total number of 'U' & 'M' alphabet
        System.out.println("Total number of alphabet U: " + countU);
        System.out.println("Total number of alphabet M: " + countM);

        sc.close();
    }
}
