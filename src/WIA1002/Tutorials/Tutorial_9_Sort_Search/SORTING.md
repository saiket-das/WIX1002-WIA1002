## Sorting Alogorithm

### Selection Sort

Select the minimum and place it at the beginning.

```
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
```

### Insertion Sort

Insert elements into the correct position in the sorted portion.

```
public static void insertionSort(int[] array) {
    int size = array.length;

    for (int i = 1; i < size; i++) {
        int current = array[i];    // The element to be inserted
        int j = i - 1;

        // Shift elements of the sorted portion that are greater than 'current' to the right
        while (j >= 0 && current < array[j]) {
            array[j + 1] = array[j];    // Shift element rightward
            j--;
        }

        // Insert the 'current' element into its correct position
        array[j + 1] = current;
    }
}
```

### Bubble Sort

Repeatedly swap adjacent elements if they’re in the wrong order.

```
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
```

### Merge Sort

Divide array into halves, sort recursively, and merge

```
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

    // Divide array into two halves
    divide(array, low, mid);
    divide(array, mid + 1, high);

    // Merge
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

    // Copy element from Temp array to Original array
    for (int i = low; i <= high; i++) {
        array[i] = temp.get(i - low);
    }
}

```
