package WIA1002.Tutorials.Tutorial_9_Sort_Search;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        int[] array = { 3, 2, 1, 9, 5 };
        System.out.println("Selection Sort");
        selectionSort(array);

        System.out.println("\nInsertion Sort");
        int[] array2 = { 3, 2, 1, 9, 5 };
        insertionSort(array2);
        printArray(array2);

        System.out.println("\nBubble Sort");
        int[] array3 = { 3, 2, 1, 9, 5 };
        bubbleSort(array3);
        printArray(array3);

        System.out.println("\nMerge Sort");
        int[] array4 = { 3, 2, 1, 9, 5 };
        mergeSort(array4);
        printArray(array4);
    }

    // Selection sort
    public static void selectionSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < size; j++) {
                // Find min element and it's index
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }

            // Swap current element with min element
            array[index] = array[i];
            array[i] = min;
        }
    }

    // Insertion sort
    public static void insertionSort(int[] array) {
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

    // Bubble sort
    public static void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Merge sort (Divide & Merge)
    public static void mergeSort(int[] array) {
        divide(array, 0, array.length - 1);
    }

    // Divide the array
    public static void divide(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        divide(array, low, mid);
        divide(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    // Merge sorted array
    public static void merge(int[] array, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (array[left] < array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }

        // Append remaining elements from the Left half (if any)
        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }

        // Append remaining elements from the Right half (if any)
        while (right <= high) {
            temp.add(array[right]);
            right++;
        }

        // Copy element from Temp list to Original List
        for (int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }
    }

    // Print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
