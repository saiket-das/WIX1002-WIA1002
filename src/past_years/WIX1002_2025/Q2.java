package past_years.WIX1002_2025;

import java.util.*;

public class Q2 {

    static Random random = new Random();

    public static void main(String[] agrs) {
        int n = findLargestEven();
        if (n == -1) {
            System.out.println("\nDont have any even number");
        } else {
            System.out.println("\nLargest even number: " + n);
        }
    }

    public static int findLargestEven() {
        int[] nums = new int[10];

        int largeEvenNum = -1;
        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(1, 101);
            nums[i] = n;

            if ((n % 2 == 0) && (largeEvenNum < n)) {
                largeEvenNum = n;
            }
        }

        System.out.print("Numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }

        return largeEvenNum;
    }
}
