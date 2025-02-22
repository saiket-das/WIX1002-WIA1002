package WIX1002.Labs.Lab_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        // Second number input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in seconds: ");
        int seconds = sc.nextInt();

        int hours;
        int mins;
        int sec;

        hours = seconds / 3600;
        mins = (seconds - 3600 * hours) / 60;
        sec = (seconds - 3600 * hours) % 60;

        System.out.println(seconds + " Seconds is " + hours + " hours, " + mins + " mintues and " + sec + " seconds");
        sc.close();
    }
}
