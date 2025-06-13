package WIA1002.PastYears.WIA1002_2023_2;

import java.util.*;
/*
  Based on the Java library java util.LinkedList, develop ExamStack, a generic stack class. 
  This class should have 4 methods only, i.e. peep, pop, push and getSize.
*/

public class Q1 {
    public static void main(String[] args) {
        ExamStack<Integer> es = new ExamStack<>();

        es.push(10);
        es.push(20);
        es.push(30);
        es.push(40);
        es.push(50);

        System.out.println("Peek: " + es.peek());
        System.out.println("Pop: " + es.pop());
        System.out.println("Peek: " + es.peek());
        System.out.println("Size: " + es.getSize());
    }
}

class ExamStack<E> {
    private LinkedList<E> list;

    ExamStack() {
        list = new LinkedList<>();
    }

    public void push(E e) {
        list.addLast(e);
    }

    public E pop() {
        return list.removeLast();
    }

    public E peek() {
        return list.getLast();
    }

    public int getSize() {
        return list.size();
    }
}
