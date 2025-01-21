package past_years.WIX1002_2020;

import java.util.*;
import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        String filePath = "src/WIX1002_2020/files/raw.txt";
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("FIle not found!");
            return;
        }

        List<Integer> frequencies = new ArrayList<>();

        // Read file, get all numbers and save to an Array List
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] nums = line.split(",");

                // Save number into Array List (frequencies)
                for (String num : nums) {
                    frequencies.add(Integer.parseInt(num.trim()));
                }
            }

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        // Save into number as key and frequency count as value
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (Integer num : frequencies) {
            frequencyCount.put(num, frequencyCount.getOrDefault(num, 0) + 1);
        }

        // Print answer (All number in frequency and total frequency count) and (Mode)
        int mode = frequencies.get(0);
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("The mode of the dataset is: " + mode);
    }
}
