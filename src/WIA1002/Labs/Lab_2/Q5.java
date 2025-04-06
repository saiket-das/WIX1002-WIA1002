package WIA1002.Labs.Lab_2;

import java.util.Arrays;
import java.util.Collections;

class Circle {

}

public class Q5 {
    public static void main(String[] args) {
        Integer[] a = { 1, 2, 3 };
        String[] b = { "Red", "Blue", "Green" };
        Double[] c = { 3.0, 2.9, 5.9 };

        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c));
    }

    static <E extends Comparable<E>> E max(E[] list) {
        if (list == null) {
            throw new IllegalArgumentException("Array can't be null or empty.");
        }
        Arrays.sort(list, Collections.reverseOrder());
        return list[0];
    }
}
