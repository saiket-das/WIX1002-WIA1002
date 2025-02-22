package WIX1002.Labs.Lab_5;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {

        Random ran = new Random();
        int numbers[] = new int[10];

        int i = 0;
        while (i < 10) {
            int number = ran.nextInt(0, 21);

            if (i == 0) {
                numbers[0] = number;
                i++;
            } else if (!checkDuplication(numbers, number)) {
                numbers[i] = number;
                i++;
            }
        }

        System.out.println("\nNumbers Array:");
        for (int j = 0; j < 10; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.print("\n");
    }

    public static boolean checkDuplication(int[] numbers, int newNumber) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == newNumber) {
                System.out.println("Duplicate: " + "index: " + i + ": " + numbers[i] + " = " + newNumber);
                return true;
            }
        }
        return false;
    }
}
