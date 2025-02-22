package WIX1002.Labs.Lab_5;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random ran = new Random();

        int[] scores = new int[100];

        for (int i = 0; i < 100; i++) {
            int score = ran.nextInt(0, 101);
            scores[i] = score;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("Player " + (i + 1) + ": " + scores[i]);
        }
    }
}