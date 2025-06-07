package WIA1002.Labs.Lab_5_Stack;

import WIA1002.Labs.Lab_5_Stack.classes.MyStack;

public class Q1 {
    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack<Character>();

        myStack.push('a');
        myStack.push('b');
        myStack.push('c');
        myStack.push('d');
        myStack.push('e');

        System.out.println("Stack elements: [" + myStack.toString() + "]");

        if (myStack.search('b')) {
            System.out.println("b is in the stack");

        } else {
            System.out.println("b is not in the stack");
        }

        if (myStack.search('k')) {
            System.out.println("b is in the stack");
        } else {
            System.out.println("k is not in the stack");
        }
    }
}
