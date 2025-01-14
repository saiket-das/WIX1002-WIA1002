package WIX1002_2024;

import java.io.*;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        String[][] participants = new String[4][4];

        // Question (a)
        readFile(participants);
        printFile(participants);

        // Question (b)
        boolean pairParticipants = pairParticipants(participants);
        if (!pairParticipants) {
            System.out.println("\nParticipants are not in pairs, cannot proceed");
        } else {
            // Question (c)
            File fileName = new File("src/WIX1002_2024/files/arrangeSeating.txt");
            arrangeAndSaveSeating(participants, fileName);
            System.out.println("\nParticipants are in pairs");

        }

    }

    // Question (a): Read .txt file
    public static String[][] readFile(String[][] participants) {

        File file = new File("src/WIX1002_2024/files/participants.txt");

        if (!file.exists()) {
            System.out.println("File not found");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");

                // Save all the words to array
                for (int j = 0; j < 4; j++) {
                    participants[i][j] = words[j];
                }
                i++;

            }
        } catch (Exception error) {
            System.out.print(error.getMessage());
        }

        return participants;
    }

    // Print the array in a table form
    public static void printFile(String[][] participants) {
        // Save all the words to array
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-15s %-3s %-3s %-3s \n", participants[i][0], participants[i][1], participants[i][2],
                    participants[i][3]);

        }
    }

    // Question (b): Pair participants aby their address;
    public static boolean pairParticipants(String[][] participants) {
        // Task 2: Compare addresses using HashSet
        HashSet<String> uniqueAddresses = new HashSet<>();
        HashSet<String> duplicateAddresses = new HashSet<>();

        // Add address to unique and duplicate address
        for (String[] participant : participants) {
            String normalAddress = normalizeAddress(participant[3]);
            if (!uniqueAddresses.add(normalAddress)) {
                duplicateAddresses.add(normalAddress);
            }
        }

        if (duplicateAddresses.size() != 2) {
            return false;
        }

        return true;
    }

    // Question (c)
    public static void arrangeAndSaveSeating(String[][] participants, File fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            // Normalize addresses and group participants into pairs
            Map<String, List<String[]>> addressGroups = new HashMap<>();
            for (String[] participant : participants) {
                String normalizedAddress = normalizeAddress(participant[3]);
                addressGroups.computeIfAbsent(normalizedAddress, k -> new ArrayList<>()).add(participant);
            }

            // Reverse the list of participants for each address group (the values are
            // reversed when added)
            List<List<String[]>> reversedAddressGroups = new ArrayList<>(addressGroups.values());
            Collections.reverse(reversedAddressGroups);

            // Now, assign seats A, B, C, D based on the pairs
            List<String[]> pair1 = new ArrayList<>();
            List<String[]> pair2 = new ArrayList<>();

            // Fill the pairs
            for (List<String[]> group : reversedAddressGroups) {
                if (group.size() >= 2) {
                    pair1.add(group.get(0)); // First participant of the pair
                    pair2.add(group.get(1)); // Second participant of the pair
                }
            }

            // Write the seating arrangement in the correct format
            writer.write(String.format("Seat A: %s, Age %s, %s\n", pair1.get(0)[0], pair1.get(0)[2], pair1.get(0)[3]));
            writer.write(String.format("Seat B: %s, Age %s, %s\n", pair2.get(0)[0], pair2.get(0)[2], pair2.get(0)[3]));
            writer.write(String.format("Seat C: %s, Age %s\n", pair1.get(1)[0], pair1.get(1)[2]));
            writer.write(String.format("Seat D: %s, Age %s\n", pair2.get(1)[0], pair2.get(1)[2]));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Helper method to normalize addresses
    private static String normalizeAddress(String address) {
        // Convert to lowercase and remove extra spaces
        return address.toLowerCase().replaceAll("\\s+", "").trim();
    }
}
