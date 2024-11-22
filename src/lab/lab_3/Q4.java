package lab.lab_3;

import java.util.Random;

public class Q4 {

    public static void main(String[] args) {

        int playerOne = 0, playerTwo = 0;

        for (int i = 0; i < 2; i++) {
            Random random = new Random();
            int playerOneRoll = random.nextInt(0, 7);
            int playerTwoRoll = random.nextInt(0, 7);

            playerOne += playerOneRoll;
            playerTwo += playerTwoRoll;
        }

        if (playerOne < playerTwo) {
            System.out.println("Player two wins");
        } else {
            System.out.println("Player one wins");
        }
    }
}
