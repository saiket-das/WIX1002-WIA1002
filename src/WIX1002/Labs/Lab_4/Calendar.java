package WIX1002.Labs.Lab_4;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Year and Day Input
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter date (0 for Sunday, 1 for Monday, ... , 6 for Saturday): ");
        int day = input.nextInt();

        int may = 5, august = 8;
        for (int i = 1; i <= august; i++) {
            if (i == may) {
                System.out.println("May " + year);
                System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat  ");
                for (int d = 0; d < day; d++)
                    System.out.printf("     ");
                for (int j = 1; j <= 31; j++) {
                    System.out.printf("%-5d", j);
                    day++;
                    day %= 7;
                    if (day == 0)
                        System.out.println("");
                }
            } else if (i == august) {
                System.out.println("\n\n");
                System.out.println("August " + year);
                System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
                for (int d = 0; d < day; d++)
                    System.out.printf("     ");
                for (int j = 1; j <= 31; j++) {
                    System.out.printf("%-5d", j);
                    day++;
                    day %= 7;
                    if (day == 0)
                        System.out.println("");
                }
                System.out.println("");
            } else if (i == 2) {
                if (isLeap(year)) {
                    day = (day + 29) % 7;

                } else {
                    day = (day + 28) % 7;
                }
            } else if (i == 4 || i == 6) {
                day = (day + 30) % 7;
            } else {
                day = (day + 31) % 7;
            }
        }

        input.close();
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
