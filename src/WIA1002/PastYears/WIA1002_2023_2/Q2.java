package WIA1002.PastYears.WIA1002_2023_2;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter expression to evaluate: ");
        String expr = input.nextLine().replaceAll("\\s+", "");

        System.out.println(findAns(expr));

        input.close();
    }

    static double findAns(String expr) {
        ExamStack<Character> exStack = new ExamStack<>();

        double answer = 0;
        for (char ch : expr.toCharArray()) {
            if (ch == ')') {
                while (exStack.pop() != '(') {

                }
            }
        }

        return answer;
    }
}
