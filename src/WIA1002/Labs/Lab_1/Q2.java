package WIA1002.Labs.Lab_1;

public class Q2 {
    // Method to find the maximum of three values
    static <T extends Comparable<T>> T CompareMax(T num1, T num2, T num3) {
        T max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo((max)) > 0) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(CompareMax(12, 21, 11));
    }
}
