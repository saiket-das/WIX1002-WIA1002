package WIX1002.PastYears.WIX1002_2025;

import java.util.*;
import java.io.*;

public class Q4 {
    public static void main(String[] agers) {
        File inputFile = new File("src/past_years/WIX1002_2025/files/input.txt");
        File outputFile = new File("src/past_years/WIX1002_2025/files/output.txt");

        if (!inputFile.exists()) {
            System.out.println("File not found!");
            return;
        }

        // Read input.txt file and save to array list
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        // String Manipulator class
        StringManipulator stringManipulator = new StringManipulator(lines);

        // Call methods
        System.out.println("Original text");
        stringManipulator.display();

        System.out.println("\nClean text");
        stringManipulator.textClean();
        stringManipulator.display();

        System.out.println("\nReverse text");
        stringManipulator.reverseText();
        stringManipulator.display();

        System.out.println("\nRearrange text");
        stringManipulator.rearrangePosition();
        stringManipulator.display();

        // Write new lines to output.txt file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            List<String> outputLines = new ArrayList<>(stringManipulator.getLines());
            for (String line : outputLines) {
                bw.write(line + '\n');
            }

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}

// String Manipulator Class
class StringManipulator {
    List<String> lines = new ArrayList<>();

    public StringManipulator(List<String> lines) {
        this.lines = lines;
    }

    public void textClean() {
        List<String> cleanLines = new ArrayList<>();
        for (String line : lines) {
            line = line.replaceAll("[\\s\\$\\#\\@\\~]", "");
            line = line.substring(1, line.length() - 1);
            cleanLines.add(line);
        }

        this.lines = cleanLines;
    }

    public void reverseText() {
        List<String> reverseLine = new ArrayList<>();
        for (String line : lines) {
            StringBuilder sb = new StringBuilder();
            sb.append(line);
            sb.reverse();
            reverseLine.add(sb.toString());
        }
        this.lines = reverseLine;
    }

    public void rearrangePosition() {
        Collections.reverse(lines);
    }

    public void display() {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public List<String> getLines() {
        return this.lines;
    }
}
