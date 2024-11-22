package tutorial.tutorial_6;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        generateNumbers(numbers);
        printArray(numbers);
    }

    public static void generateNumbers(int[] numbers) {
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int num = ran.nextInt(0, 101);
            numbers[i] = num;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}
