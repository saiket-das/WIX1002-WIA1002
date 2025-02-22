package WIX1002.PastYears.WIX1002_2018;

import java.io.*;
import java.util.*;

class Player {
    String playerName;
    double finalScore;
    double degreeOfDifficulty;

    public Player(String playerName, double[] scores, double degreeOfDifficulty) {
        this.playerName = playerName;
        this.degreeOfDifficulty = degreeOfDifficulty;
        this.finalScore = calculateScore(scores, degreeOfDifficulty);
    }

    // Calculate final score of a Player
    public static double calculateScore(double[] scores, double degreeOfDifficulty) {
        double finalScore = 0;

        double lowestScore = scores[0];
        double highestScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
            } else if (highestScore < scores[i]) {
                highestScore = scores[i];
            }
        }

        boolean skipLowestScore = false, skipHighestScore = false;
        for (double score : scores) {
            if ((score == lowestScore && !skipLowestScore)) {
                skipLowestScore = true;
                continue;
            }
            if ((score == highestScore && !skipHighestScore)) {
                skipHighestScore = true;
                continue;
            }
            finalScore += score;
        }

        return (finalScore * degreeOfDifficulty);
    }

    @Override
    public String toString() {
        return String.format("%-8s %.2f", playerName, finalScore);
    }
}

public class Q4 {
    public static void main(String[] args) {
        File filePath = new File("src/past_years/WIX1002_2018/files/Q4.txt");

        if (!filePath.exists()) {
            System.out.println("File not found!");
            return;
        }

        ArrayList<Player> players = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");

                // Add all Player to Players List
                int len = words.length;
                String playerName = words[0];
                double degreeOfDifficulty = Double.parseDouble(words[len - 1]);
                double[] scores = new double[len - 2];

                for (int i = 1; i < len - 1; i++) {
                    scores[i - 1] = Double.parseDouble(words[i]);
                }

                Player player = new Player(playerName, scores, degreeOfDifficulty);
                players.add(player);
            }

        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        String winnerName = " ";
        double highestScore = 0;
        for (Player player : players) {
            if (highestScore < player.finalScore) {
                highestScore = player.finalScore;
                winnerName = player.playerName;
            }
            System.out.println(player.toString());
        }

        System.out.println(winnerName + "is the winner.");
    }

}

/*
 * Sophia 6.0 6.5 6.5 7.0 7.5 3.5
 * John 5.0 5.0 5.5 5.5 6.0 3.0
 */
