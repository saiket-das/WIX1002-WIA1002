package WIA1002.Labs.Lab_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
    a) Create a generic stack called MyStack class using ArrayList. The MyStack generic class should i
    mplement the following methods :
      1) public void push(E 0);
      2) public E pop();
      3) public E peek();
      4) public int getSize();
      5) public boolean isEmpty();
      6) public String toString();
      7) public boolean search(E o);
 */

public class Q1 {
    public static void main(String[] args) {
        // (a) - Integer Stack
        // MyStack<Integer> intStack = new MyStack<>();

        // intStack.push(1);
        // intStack.push(2);
        // intStack.push(3);
        // intStack.pop();
        // System.out.println("Peek element: " + intStack.peek());
        // intStack.push(10);
        // System.out.println("Peek element: " + intStack.peek());
        // System.out.println("Is myStack empty?: " + intStack.isEmpty());
        // System.out.println(intStack.toString());

        // // (b) - Character Stack
        // MyStack<Character> charStack = new MyStack<>();
        // charStack.push('a');
        // charStack.push('b');
        // charStack.push('c');
        // System.out.println(charStack.toString());
        // System.out.println("Is element is in the stack? : " + charStack.search('k'));
        // System.out.println("Is element is in the stack? : " + charStack.search('b'));

        // (c) -
        MyStack<Integer> textIntStack = new MyStack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Creatting new stack");

        while (true) {
            System.out.print("Enter a new number (Type -1 to exit): ");
            Integer intInput = input.nextInt();

            if (intInput == -1) {
                break;
            }
            textIntStack.push(intInput);
        }

        System.out.println("Stack size: " + textIntStack.getSize());
        input.close();
    }

}

class MyStack<E> implements Iterable<E> {
    ArrayList<E> stack = new ArrayList<>();

    public void push(E element) {
        stack.add(element);
    }

    public void pop() {
        if (!isEmpty()) {
            stack.remove(stack.size() - 1);
        } else {
            throw new NoSuchElementException("Stack is empty");
        }
    }

    public E peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            throw new NoSuchElementException("Stack is empty");
        }
    }

    public int getSize() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean search(E searchElement) {
        for (E ele : stack) {
            if (ele == searchElement) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return stack.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return stack.iterator();
    }
}
