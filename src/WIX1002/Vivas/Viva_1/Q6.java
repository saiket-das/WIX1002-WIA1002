package WIX1002.Vivas.Viva_1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HighestScore = 0, number1 = 0, HighScore = 0, number2 = 0, sum = 0;
        Boolean NegativeScores = false;

        System.out.print("Enter the scores(0 to end):");
        while (true) {
            int score = sc.nextInt();
            if (score == 0) {
                break;
            }
            if (score < 0) {
                NegativeScores = true;
            }

            sum += score;

            if (score > HighestScore) {
                HighScore = HighestScore;
                number2 = number1;
                HighestScore = score;
                number1 = 1;
            } else if (score == HighestScore) {
                number1++;
            } else {
                if (score > HighScore) {
                    HighScore = score;
                    number2 = 1;
                } else if (score == HighScore) {
                    number2++;
                }
            }
        }

        System.out.println("****************************************");
        System.out.println("\t\tSummary");
        System.out.println("****************************************");
        System.out.println("The highest score is " + HighestScore);
        System.out.println("The occurrence count of the highest score is " + number1);
        System.out.println("The second highest score is " + HighScore);
        System.out.println("The occurrence count of the second highest score is " + number2);
        System.out.println("The total sum of all scores is " + sum);
        if (NegativeScores) {
            System.out.println("Marks deduction!!! Negative number(s) was/were entered.");
        }

        sc.close();
    }

}