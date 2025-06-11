package WIA1002.Labs.Lab_9_Sort_Search;

public class Q2 {
    public static void main(String[] args) {
        int[] list = { 45, 7, 2, 8, 19, 3 };

        selectionSortLargest(list);

        // Print sorted list
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Selection Sort (Descending Order)
    static void selectionSortLargest(int[] list) {
        int size = list.length;

        for (int i = 0; i < size; i++) {
            int max = list[i];
            int index = i;
            for (int j = i; j < size; j++) {
                if (list[j] > max) {
                    max = list[j];
                    index = j;
                }
            }

            // Swap current element with max element
            list[index] = list[i];
            list[i] = max;
        }
    }

}
