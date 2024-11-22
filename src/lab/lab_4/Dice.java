package lab.lab_4;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();

        int playerOne = 0, playerTwo = 0;
        while (playerOne <= 100 && playerTwo <= 100) {
            int playerOneDice = random.nextInt(0, 7);
            if (playerOneDice == 6) {
                playerOne += playerOneDice;
                playerOne += random.nextInt(0, 7);
            }
            int playerTwoDice = random.nextInt(0, 7);
            if (playerTwoDice == 6) {
                playerTwo += playerTwoDice;
                playerTwo += random.nextInt(0, 7);
            }
        }

        if (playerOne > playerTwo) {
            System.out.println("Player one wins");
        } else {
            System.out.println("Player two wins");
        }
    }
}