package WIX1002.PastYears.WIX1002_2025;

import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        File file = new File("src/past_years/WIX1002_2025/files/airnow.csv");
        if (!file.exists()) {
            System.out.println("File not found");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                System.out.println(words);
            }
        } catch (IOException error) {

        }
    }
}

class Mon_Site {
    String siteName;
    int year;
    int recordCount;
    int[][] records;

    public Mon_Site(String siteName, int year, int recordCount, int[][] records) {
        this.siteName = siteName;
        this.year = year;
        this.recordCount = recordCount;
        this.records = records;
    }
}