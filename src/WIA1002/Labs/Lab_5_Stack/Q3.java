package WIA1002.Labs.Lab_5_Stack;

import java.util.*;

import WIA1002.Labs.Lab_5_Stack.Classes.MyStack;

/*
 * Assuming that an unknown number of positive integers are stored in a stack, S.
 * Using only stack ADT operations write an algorithm/function to find the sum of
 * every element in S.
 */

public class Q3 {
    public static void main(String[] args) {
        Stack<Integer> testIntMyStack = new Stack<>() {
            {
                push(1);
                push(2);
                push(3);
                push(11);
                push(22);
                push(33);
            }
        };

        System.out.println("Stack before sum: " + testIntMyStack.toString());
        System.out.println("Sum: " + sumStack(testIntMyStack));
        System.out.println("Stack after sum: " + testIntMyStack.toString());

    }

    static int sumStack(Stack<Integer> s) {
        MyStack<Integer> newStack = new MyStack<>();

        int sum = 0;
        while (!s.isEmpty()) {
            int popVal = s.pop();
            sum += popVal;
            newStack.push(popVal);
        }

        // Restore value to main Stack
        while (!newStack.isEmpty()) {
            s.push(newStack.pop());
        }
        return sum;
    }
}
