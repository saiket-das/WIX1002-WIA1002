package WIA1002.Labs.Lab_9_Sort_Search;

public class Q1 {
    public static void main(String[] args) {
        int[] list = { 45, 7, 2, 8, 19, 3 };

        selectionSortSmallest(list);

        // Print sorted list
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    // Selection Sort (Ascending Order)
    static void selectionSortSmallest(int[] list) {
        int size = list.length;

        for (int i = 0; i < size; i++) {
            int min = list[i];
            int index = i;
            for (int j = i; j < size; j++) {
                if (list[j] < min) {
                    min = list[j];
                    index = j;
                }
            }

            // Swap current element with min element
            list[index] = list[i];
            list[i] = min;
        }
    }

}
