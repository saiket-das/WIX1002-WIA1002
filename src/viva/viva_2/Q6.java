package viva.viva_2;

import java.util.*;

public class Q6 {

    // Method to generate initials from a given name
    public String generateInitials(String name) {
        String[] delimiters = { " ", "'", ".", ",", "-", "_", "%", ":", "=", ";" };
        Set<String> excludedWords = new HashSet<>(Arrays.asList("bin", "binti", "a/l", "a/p"));

        List<String> parts = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (char ch : name.toCharArray()) {
            boolean isDelimiter = false;
            for (String delimiter : delimiters) {
                if (String.valueOf(ch).equals(delimiter)) {
                    isDelimiter = true;
                    break;
                }
            }

            if (isDelimiter) {
                if (temp.length() > 0) {
                    parts.add(temp.toString());
                    temp.setLength(0);
                }
            } else {
                temp.append(ch);
            }
        }

        if (temp.length() > 0) {
            parts.add(temp.toString());
        }

        StringBuilder initials = new StringBuilder();
        for (String part : parts) {
            if (!excludedWords.contains(part.toLowerCase())) {
                initials.append(part.toUpperCase().charAt(0));
            }
        }

        return initials.toString();
    }

    // Method to determine if a welcome message should be printed
    public boolean isPrintingWelcomeMessage(String name) {
        List<String> welcomeNames = Arrays.asList(
                "Kah Sing", "Lee Kah Sing", "Kah Sing Lee",
                "Suresh", "Suresh a/l Subramaniam",
                "Ridwan", "Ridwan Faiz", "Ridwan Faiz Mohamad Hassan");
        return welcomeNames.contains(name);
    }

    // Method to calculate the time interval between start and end times
    public String calculateInterval(int[] startTime, int[] endTime) {
        int startSeconds = startTime[0] * 3600 + startTime[1] * 60 + startTime[2];
        int endSeconds = endTime[0] * 3600 + endTime[1] * 60 + endTime[2];

        if (endSeconds < startSeconds) {
            endSeconds += 24 * 3600;
        }

        int intervalSeconds = endSeconds - startSeconds;

        int hours = intervalSeconds / 3600;
        int minutes = (intervalSeconds % 3600) / 60;
        int seconds = intervalSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Method to process a single test case
    public List<String> processTestCase(String name, int[] startTime, int[] endTime) {
        List<String> result = new ArrayList<>();
        result.add("+".repeat(60));

        // Generate initials
        String initials = generateInitials(name);
        result.add(initials);

        // Welcome message if applicable
        if (isPrintingWelcomeMessage(name)) {
            result.add("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
        }

        // Special message for Kah Sing
        if (name.contains("Kah Sing") && name.contains("Lee")) {
            result.add("WE KNOW IT'S YOU -- LEE KAH SING!");
        } else if (name.contains("Kah Sing")) {
            result.add("WE KNOW IT'S YOU!");
        }

        // Sleep Now message
        if ((startTime[0] < 6 || endTime[0] < 6)) {
            result.add("SLEEP NOW!!!!!!!!!!");
        }

        // Time interval
        String interval = calculateInterval(startTime, endTime);
        result.add(interval);

        result.add("+".repeat(60));
        return result;
    }

    // Main method to run test cases
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q6 q6 = new Q6();

        System.out.println("Enter the number of test cases:");
        int numTestCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numTestCases; i++) {
            System.out.println("Enter the name:");
            String name = scanner.nextLine();

            System.out.println("Enter the start time (hh:mm:ss):");
            int[] startTime = Arrays.stream(scanner.nextLine().split(":"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println("Enter the end time (hh:mm:ss):");
            int[] endTime = Arrays.stream(scanner.nextLine().split(":"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            List<String> output = q6.processTestCase(name, startTime, endTime);
            for (String line : output) {
                System.out.println(line);
            }
        }

        scanner.close();
    }
}
