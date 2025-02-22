package WIX1002.PastYears.WIX1002_2019;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] agrs) {
        File file = new File("src/past_years/WIX1002_2019/files/essay.txt");

        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        String essay = "";

        // Read file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                // Add all lines to a String (Essay)
                essay += line;
            }
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        Map<Character, Integer> letterFrequency = new HashMap<>();
        essay = essay.toUpperCase();

        int letterCount = 0;
        for (char letter : essay.toCharArray()) {
            if (Character.isLetter(letter)) {
                letterCount++;
                letterFrequency.put(letter, letterFrequency.getOrDefault(letter, 0) + 1);
            }
        }

        String[] sentences = essay.split("\\.\\s");
        System.out.println("Number of sentences: " + sentences.length);
        System.out.println("Number of letters: " + letterCount);

        // Print the frequency of each letter
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + "  ");
        }

    }
}
