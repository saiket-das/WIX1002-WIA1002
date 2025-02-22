package WIX1002.Labs.Lab_5;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++) {
            int num = ran.nextInt(0, 101);
            numbers[i] = num;
        }

        int len = numbers.length;

        // Sort the array in descending order
        sortArray(numbers, len);
        System.out.print("Array in descending order: ");
        printArray(numbers, len);

        // Search number input
        System.out.print("\nEnter a number to search: ");
        int searchNumber = sc.nextInt();

        // Linear Search
        int totalLinearLoop = linearSearch(numbers, len, searchNumber);
        isFound(totalLinearLoop, searchNumber);

        // Binary search
        int totalBinaryLoop = binarySearch(numbers, len, searchNumber);
        isFound(totalBinaryLoop, searchNumber);

        sc.close();
    }

    // Sort array in descending order
    public static int[] sortArray(int[] numbers, int len) {
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    // Search number using Linear Search
    public static int linearSearch(int[] numbers, int len, int searchNumber) {
        int totalLoop = 1;
        for (int i = 0; i < len; i++) {
            if (numbers[i] == searchNumber) {
                return totalLoop;
            }
            totalLoop++;
        }
        return -1;
    }

    // Search number using Binary Search
    public static int binarySearch(int[] numbers, int len, int searchNumber) {
        int i = 0, j = len - 1, m = 0;
        int totalLoop = 1;
        while (i <= j) {
            m = (i + j) / 2;
            if (numbers[m] == searchNumber) {
                return totalLoop;
            } else if (searchNumber > numbers[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
            totalLoop++;
        }
        return -1;
    }

    public static void numberFound(boolean found, int searchNumber) {
        if (found) {
            System.out.println(searchNumber + " found");
        } else {
            System.out.println(searchNumber + " not found");
        }
    }

    public static void printArray(int[] numbers, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");
            ;
        }
    }

    public static void isFound(int totalLoop, int searchNumber) {
        if (totalLoop == -1) {
            System.out.println(searchNumber + " not found");

        } else {
            System.out.println(searchNumber + " found");
            System.out.println("Binary search: " + totalLoop + " loop(s)");
        }
    }

}
