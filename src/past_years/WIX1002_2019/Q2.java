package past_years.WIX1002_2019;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Dimension of Matrix
        System.out.print("Enter N: ");
        int n = input.nextInt();

        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];

        matrixA = generateMatrix(matrixA, n);
        matrixB = generateMatrix(matrixB, n);

        // Print Matrix A and B
        System.out.println("Matrix A");
        printMatrix(matrixA, n);
        System.out.println("Matrix B");
        printMatrix(matrixB, n);

        // Add Two Matrix
        System.out.println("Matrix A + B");
        int[][] addMatrix = addTwoMatrix(matrixA, matrixB, n);
        printMatrix(addMatrix, n);

        // Add Two Matrix
        System.out.println("Matrix A * B");
        int[][] multiMatrix = multiTwoMatrix(matrixA, matrixB, n);
        printMatrix(multiMatrix, n);

        input.close();

    }

    // Generate a Matrix with random numbers
    public static int[][] generateMatrix(int[][] matrix, int n) {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = random.nextInt(0, 10);
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    // Display matrix
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Add two matrix
    public static int[][] addTwoMatrix(int[][] matrixA, int[][] matrixB, int n) {
        int[][] newMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = matrixA[i][j] + matrixB[i][j];
                newMatrix[i][j] = value;
            }
        }
        return newMatrix;
    }

    // Add two matrix
    public static int[][] multiTwoMatrix(int[][] matrixA, int[][] matrixB, int n) {
        int[][] newMatrix = new int[n][n];

        // [A B] * [E F] = [AE+BG AF+BH]
        // [C D] * [G H] = [CE+DG CF+DH]
        // i = 0, j = 0, k = 0
        // -- j = 1st --------------------------- j = 2nd --
        // [0][0]*[0][0] + [0][1]*[1][0] | -- | [0][0]*[0][1] + [0][1]*[1][1] |
        // [1][0]*[0][0] + [1][1]*[1][0] | -- | [1][0]*[0][1] + [1][1]*[1][1] |

        // [i][j] * [i][j] + [i][k] + [k][i]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    newMatrix[i][j] += matrixA[i][k] * matrixB[k][j]; // A * E
                }
            }
        }
        return newMatrix;
    }

}
