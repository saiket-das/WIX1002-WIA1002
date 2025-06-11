package WIA1002.Labs.Lab_9_Sort_Search;

public class Q4 {
    public static void main(String[] args) {
        int[] array = { 45, 7, 2, 8, 19, 3 };

        insertionSort(array);

        // Print sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    // Insertion Sort
    static void insertionSort(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int current = array[i];

            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
