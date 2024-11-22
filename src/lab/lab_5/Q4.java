package lab.lab_5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        System.out.println("3 by 3 matirx");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = sc.nextInt();
                matrix[i][j] = num;
            }
        }

        int[][] rotatedMatrix = rotateClockwise(matrix);
        printMatrix(rotatedMatrix);

        sc.close();
    }

    public static int[][] rotateClockwise(int[][] matrix) {
        int[][] rotatedMatrix = new int[3][3];
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                rotatedMatrix[j][len - 1 - i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("\nAfter rotation:");
        int len = matrix.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
