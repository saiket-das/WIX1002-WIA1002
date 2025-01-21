package past_years.WIX1002_2018;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User inputs
        System.out.print("Enter font size: ");
        int fontSize = input.nextInt();

        System.out.print("Enter font type: ");
        char fontType = input.next().charAt(0);

        System.out.print("Enter format: [1 - Vertical, 2 - Horizontal]: ");
        int format = input.nextInt();

        if (format == 1) {
            printVerticalFormat(fontSize, fontType);
        } else {
            printHorizontalFormat(fontSize, fontType);
        }
        input.close();
    }

    // Print vertical format
    public static void printVerticalFormat(int fontSize, char fontType) {
        int n = fontSize + 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(fontType);
                } else {
                    if (j == 1 || j == n) {
                        System.out.print(fontType);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n) {
                    System.out.print(fontType);
                } else {
                    if (j == 1 || j == n) {
                        System.out.print(fontType);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }

    // Print horizontal format

    public static void printHorizontalFormat(int fontSize, char fontType) {
        int hLen = fontSize * 2 + 3; // Horizontal Lentgh
        int vLen = fontSize + 2; // Vertical Lentgj

        System.out.println(hLen / 2);
        for (int i = 1; i <= vLen; i++) {
            for (int j = 1; j <= hLen; j++) {
                // First and last line (Font)
                if (i == 1 || i == vLen) {
                    System.out.print(fontType);
                } else {
                    // Middle lines (Font)
                    if (j == 1 || j == hLen || j == (hLen / 2 + 1)) {
                        System.out.print(fontType);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
