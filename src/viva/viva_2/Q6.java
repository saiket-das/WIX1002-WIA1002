package viva.viva_2;

import java.util.*;

public class Q6 {

    public static String generateInitials(String name) {
        String[] delimiters = { " ", "'", "-", "_" };
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
    public static boolean isPrintingWelcomeMessage(String name) {
        List<String> welcomeNames = Arrays.asList(
                "Kah Sing", "Lee Kah Sing", "Kah Sing Lee",
                "Suresh", "Suresh a/l Subramaniam",
                "Ridwan", "Ridwan Faiz", "Ridwan Faiz Mohamad Hassan");
        return welcomeNames.contains(name);
    }

    // Method to calculate the time interval between start and end times
    public static String calculateInterval(int[] startTime, int[] endTime) {
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
    public static List<String> processTestCase(String name, int[] startTime, int[] endTime) {
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
        // Q6 g101 = new Q6();

        // Sample test cases
        String[][] testCases = {
                { "Kah Sing Lee", "23:30:00", "01:00:00" },
                { "Ridwan Faiz", "12:00:00", "14:30:00" },
                { "Suresh a/l Subramaniam", "05:00:00", "07:00:00" }
        };

        for (String[] testCase : testCases) {
            String name = testCase[0];
            int[] startTime = Arrays.stream(testCase[1].split(":"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] endTime = Arrays.stream(testCase[2].split(":"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            List<String> output = processTestCase(name, startTime, endTime);
            for (String line : output) {
                System.out.println(line);
            }
        }
    }
}
