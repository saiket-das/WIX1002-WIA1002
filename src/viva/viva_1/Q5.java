package viva.viva_1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String remixSong, initialSong;

        System.out.print("Enter the song in Uppercase: ");
        remixSong = keyboard.nextLine();
        keyboard.close();

        while (true) {
            if (remixSong.length() < 200 && !remixSong.isEmpty()) {
                break;
            }
            System.out.println("Invalid input, your input is either too long or is empty. Please reenter.\n");
            System.out.print("Enter the song (Uppercase): ");
            remixSong = keyboard.nextLine();
        }

        remixSong = remixSong.toUpperCase();
        String regex = "REMIX";
        initialSong = remixSong.replaceAll(regex, " ");
        System.out.println("The initial Song is " + initialSong.trim());
    }
}