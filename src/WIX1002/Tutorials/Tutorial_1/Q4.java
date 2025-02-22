package WIX1002.Tutorials.Tutorial_1;

import java.lang.Math;

// Print the results of the two player's dice game.
public class Q4 {
    public static void main(String[] args) {

        // Player 1 & Player 2
        int playerOnePoint = 0;
        int playerTwoPoint = 0;

        for (int i = 0; i < 10; i++) {
            playerOnePoint += (int) ((Math.random() * 6) + 1);
            playerTwoPoint += (int) ((Math.random() * 6) + 1);
        }

        System.out.println("Player One point: " + playerOnePoint);
        System.out.println("Player Two point: " + playerTwoPoint);
        if (playerOnePoint == playerTwoPoint) {
            System.out.println("It's draw");
        } else if (playerOnePoint < playerTwoPoint) {
            System.out.println("The winner is player Two");
        } else {
            System.out.println("The winner is player One");
        }
    }
}
