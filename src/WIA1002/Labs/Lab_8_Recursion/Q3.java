package WIA1002.Labs.Lab_8_Recursion;

/*
  Write a recursive method called exponent(x,y) to perform exponentiation return xy, assuming y >= 0. 
  Example: exponent(10,3) → will produce an output of 1000
*/

public class Q3 {
    public static void main(String[] args) {
        System.out.println(recursion(10, 3));
    }

    static int recursion(int x, int y) {
        if (y == 0)
            return 1;

        return x * recursion(x, y - 1);
    }
}
