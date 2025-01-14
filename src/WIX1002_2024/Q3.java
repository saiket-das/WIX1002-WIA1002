package WIX1002_2024;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        File file = new File("src/WIX1002_2024/files/oaiset.csv");
        List<String[]> validRecords = new ArrayList<>();
        Map<String, Integer> authorPublicationCounts = new TreeMap<>();

        if (!file.exists()) {
            System.out.print("File not found!");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                // Skip first line (As it is header)
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] attributes = line.split(",");

                String status = attributes.length >= 13 ? attributes[12] : ""; // Default to empty if status is missing
                if (status.equalsIgnoreCase("deleted")) {
                    System.out.println("Skipping deleted entry: " + line); // Log the skipped entry
                    continue; // Skip this row if status is "deleted"
                }

                validRecords.add(attributes);

                // Count author's totla publication
                for (int i = 3; i <= 10; i++) {
                    String author = attributes[i];
                    if (!author.isEmpty()) {
                        authorPublicationCounts.put(author,
                                authorPublicationCounts.getOrDefault(author, 0) + 1);
                    }
                }

            }

            System.out.println("The summary report is as follow");
            // Print summary report
            System.out.println("\nAuthor Publication Summary (Sorted by Author Name):");
            for (Map.Entry<String, Integer> entry : authorPublicationCounts.entrySet()) {
                System.out.printf("%-15s: %-30d%n", entry.getKey(), entry.getValue());
            }

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    // public class OAIRecord {
    // String doi;
    // String title;
    // String subject;
    // String author1;
    // String author2;
    // String author3;
    // String author4;
    // String author5;
    // String author6;
    // String author7;
    // String author8;
    // String keyword;
    // String status;

    // public OAIRecord(String doi,
    // String title,
    // String subject,
    // String author1,
    // String author2,
    // String author3,
    // String author4,
    // String author5,
    // String author6,
    // String author7,
    // String author8,
    // String keyword,
    // String status) {
    // this.doi = doi;
    // this.title = title;
    // this.subject = subject;
    // this.author1 = author1;
    // this.author2 = author2;
    // this.author3 = author3;
    // this.author4 = author4;
    // this.author5 = author5;
    // this.author6 = author6;
    // this.author7 = author7;
    // this.author8 = author8;
    // this.keyword = keyword;
    // this.status = status;
    // }
    // }

}
