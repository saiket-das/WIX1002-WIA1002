package WIA1002.Labs.Lab_1;

public class Q6 {
    public static void main(String[] agrs) {
        Integer[][] intTwoDArray = { { 4, 5, 6 }, { 1, 2, 3 } };

        System.out.println("Minimum: " + min(intTwoDArray));
        System.out.println("Maximum: " + max(intTwoDArray));
    }

    // a) Method returns the minimum element in a two-dimensional array
    public static <E extends Comparable<E>> E min(E[][] list) {
        if (list == null) {
            throw new IllegalArgumentException("List can't be null or empty");
        }
        E minElement = list[0][0];
        for (E[] row : list) {
            for (E element : row) {
                if (element.compareTo(minElement) < 0) {
                    minElement = element;
                }
            }
        }
        return minElement;
    }

    // b) Method returns the maximum element in a two-dimensional array
    public static <E extends Comparable<E>> E max(E[][] list) {
        if (list == null) {
            throw new IllegalArgumentException("List can't be null or empty");
        }

        E maxElement = list[0][0];
        for (E[] row : list) {
            for (E element : row) {
                if (element.compareTo(maxElement) > 0) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
    }
}
