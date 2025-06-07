package WIA1002.Labs.Lab_5_Stack;

import java.util.*;

import WIA1002.Labs.Lab_5_Stack.classes.MyStack;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack<Integer> testIntMyStack = new MyStack<>();

        System.out.println("Type integer values, Enter '-1'to quit");

        while (true) {
            int userInput = input.nextInt();

            if (userInput == -1)
                break;

            testIntMyStack.push(userInput);
        }

        System.out.println("Integer stack: [" + testIntMyStack.toString() + "]");
        System.out.println();

        while (!testIntMyStack.isEmpty()) {
            testIntMyStack.pop();
            System.out.println("Current stack: [" + testIntMyStack.toString() + "]");
        }

        input.close();
    }
}
