package WIX1002.Labs.Lab_5;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n = Number of employee
        System.out.print("Enter the number of employees: ");
        int numberOfEmployee = sc.nextInt();

        int[][] workHours = new int[numberOfEmployee][7];
        int[] totalHours = new int[numberOfEmployee];
        String[] days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

        for (int i = 0; i < numberOfEmployee; i++) {
            Random ran = new Random();
            for (int j = 0; j < 7; j++) {
                workHours[i][j] = ran.nextInt(1, 9);
                totalHours[i] += workHours[i][j];
            }
        }

        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println("Employee " + (i + 1) + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(days[j] + "   ");
            }
            System.out.print("\n");
            for (int j = 0; j < 7; j++) {
                System.out.print(workHours[i][j] + " hr  ");
                // System.out.print(days[j] + ": " + workHours[i][j] + " hours | ");
            }
            System.out.println("\nTotol work hours: " + totalHours[i] + "\n");
        }
        sc.close();
    }
}
