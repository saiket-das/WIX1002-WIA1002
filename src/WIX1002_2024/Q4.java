package WIX1002_2024;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int[][] seatPlans = new int[5][5];

        printSeatPlans(initializeSeatingPlan(seatPlans));

        int[] analyzeSeating = analyzeSeating(seatPlans);
        System.out.println("\nTotal Occupied Seats: " + analyzeSeating[0]);
        System.out.println("Row with Most Occupied Seats: " + analyzeSeating[1]);
    }

    public static int[][] initializeSeatingPlan(int[][] seatPlans) {
        Random random = new Random();

        int len = seatPlans.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int seatValue = random.nextInt(0, 2);
                seatPlans[i][j] = seatValue;
            }
        }
        return seatPlans;
    }

    public static void printSeatPlans(int[][] seatPlans) {
        int len = seatPlans.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(seatPlans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[] analyzeSeating(int[][] seatPlans) {
        int[] total = new int[2];

        int totalOccupiedSeats = 0, mostOccupiedRow = 0, lastRow = 0, currentRow = 0;

        int len = seatPlans.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (seatPlans[i][j] > 0) {
                    totalOccupiedSeats++;
                    currentRow++;
                }
            }
            if (lastRow <= currentRow) {
                lastRow = currentRow;
                mostOccupiedRow = i;
            }
            currentRow = 0;
        }

        total[0] = totalOccupiedSeats;
        total[1] = mostOccupiedRow;

        return total;

    }
}
