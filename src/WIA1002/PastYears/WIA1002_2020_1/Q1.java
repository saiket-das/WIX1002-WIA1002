package WIA1002.PastYears.WIA1002_2020_1;

import java.util.*;
/* Write a program to implement generic stack. */

public class Q1 {
    public static void main(String[] args) {

    }
}

class GenericStack<E> {
    private ArrayList<E> list;

    GenericStack() {
        list = new ArrayList<>();
    }

    public void push(E e) {
        System.out.println("Push: " + e);
        list.addLast(e);
    }

    public void pushMany(E[] elements) {
        System.out.println("Push many into stack");
        for (E e : elements) {
            push(e);
        }
    }

    public E pop() {
        System.out.println("Pop the top of the stack: " + list.getLast());
        return list.removeLast();
    }

    public void popAll() {
        list.clear();
    }

    public E peek() {
        return list.getLast();
    }

    public E popMiddle() {
        if (list.size() % 2 == 0) {
            System.out.println("Current count of stack is even number, so no middle index.");
            System.out.println("Pop middle of the stack: " + null);
            return null;
        } else {
            System.out.println("Pop middle of the stack: " + list.get(list.size() / 2));
            return list.remove(list.size() / 2);
        }
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty, nothing to display.");
        }
        return list.isEmpty();
    }

    public boolean isFull() {
        for (E e : list) {
            if (e == null) {
                return false;
            }
        }
        return true;
    }

    public void display() {
        System.out.println("There are " + list.size() + " items in the stack. Displaying...");
        for (E e : list) {
            System.out.println(e);
        }
        System.out.println();
    }
}
