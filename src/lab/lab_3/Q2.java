package lab.lab_3;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(0, 6);

        switch (randomNum) {
            case (0):
                result(randomNum, "Zero");
                break;
            case (1):
                result(randomNum, "One");
                break;
            case (2):
                result(randomNum, "Two");
                break;
            case (3):
                result(randomNum, "Three");
                break;
            case (4):
                result(randomNum, "Four");
                break;
            case (5):
                result(randomNum, "Five");
                break;
            default:
                break;
        }
    }

    public static void result(int randomNum, String word) {
        System.out.println(randomNum + " is " + word);
    }
}
