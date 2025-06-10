package WIA1002.Tutorials.Tutorial_8_Recursion;

public class Tutorial_8 {
    public static void main(String[] args) {
        // System.out.println(Q1(0));
        // System.out.println(Q2(-2));
        // System.out.println("Question 3: " + Q3("string"));
        // System.out.println("Question 4: " + Q4(5));
        System.out.print("Question 5: ");
        Q5(4567);
        System.out.println();
    }

    // Q1
    public static int Q1(int n) {
        if (n == 1)
            return n;
        else
            return n * Q1(n - 1);
    }

    // Q2
    public static int Q2(int n) {
        if (n == 0)
            return n;
        else
            return Q2(n + 1) + n;
    }

    // Q3
    public static String Q3(String str) {
        if (str.isEmpty())
            return str;
        else
            return Q3(str.substring(1)) + str.charAt(0);
    }

    // Q4
    public static int Q4(int n) {
        if (n == 1)
            return 1;
        else
            return Q4(n - 1) + n;
    }

    // Q5
    public static void Q5(int n) {
        if (n == 0)
            return;

        Q5(n / 10);
        System.out.print(n % 10 + " ");
    }
}
