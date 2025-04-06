package WIA1002.Labs.Lab_2;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] agrs) {

        Integer[] intArray = { 5, 3, 7, 1, 4, 9, 8, 2 };
        String[] strArray = { "red", "blue", "orange", "tan" };
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }

    static <T extends Comparable<T>> String minmax(T[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can't be null or empty.");
        }

        Arrays.sort(array);
        T min = array[0];
        T max = array[array.length - 1];

        return "Min = " + min + ", Max = " + max;
    }
}