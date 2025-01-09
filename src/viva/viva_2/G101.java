package viva.viva_2;

import java.util.Scanner;

public class G101 {

    // Generate the initials of the user's name
    public String generateInitials(String name) {
        StringBuilder initials = new StringBuilder();
        String[] words = name.trim().split("\\s+");
        for (String word : words) {
            initials.append(word.charAt(0));
        }
        return initials.toString().toUpperCase();
    }

    // Print the welcome message
    public void printWelcomeMessage() {
        System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
    }

    // Calculate the time interval in hh:mm:ss format
    public String calculateInterval(int[] startTime, int[] endTime) {
        int startSeconds = startTime[0] * 3600 + startTime[1] * 60 + startTime[2];
        int endSeconds = endTime[0] * 3600 + endTime[1] * 60 + endTime[2];

        // Handle next-day scenario
        if (endSeconds < startSeconds) {
            endSeconds += 24 * 3600;
        }

        int interval = endSeconds - startSeconds;
        int hours = interval / 3600;
        int minutes = (interval % 3600) / 60;
        int seconds = interval % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        G101 g101 = new G101();

        // Read the number of test cases
        int testCases = Integer.parseInt(scanner.nextLine());
        if (testCases < 1 || testCases > 10) {
            System.out.println("Error: The number of test cases must be between 1 and 10.");
            scanner.close();
            return;
        }

        for (int t = 0; t < testCases; t++) {
            // Print 60 '+' characters
            System.out.println("+".repeat(60));

            // Read user name and generate initials
            String name = scanner.nextLine();
            String initials = g101.generateInitials(name);
            System.out.println(initials);

            // Print the welcome message for the first test case
            if (t == 0) {
                g101.printWelcomeMessage();
            }

            // Read start and end times
            String[] startTimeInput = scanner.nextLine().split(":");
            String[] endTimeInput = scanner.nextLine().split(":");

            int[] startTime = {
                    Integer.parseInt(startTimeInput[0]),
                    Integer.parseInt(startTimeInput[1]),
                    Integer.parseInt(startTimeInput[2])
            };

            int[] endTime = {
                    Integer.parseInt(endTimeInput[0]),
                    Integer.parseInt(endTimeInput[1]),
                    Integer.parseInt(endTimeInput[2])
            };

            // Calculate and print the time interval
            String interval = g101.calculateInterval(startTime, endTime);
            System.out.println(interval);

            // Print 60 '+' characters
            System.out.println("+".repeat(60));
        }

        scanner.close();
    }
}
