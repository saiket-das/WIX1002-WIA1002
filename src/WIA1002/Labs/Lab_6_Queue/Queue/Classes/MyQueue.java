package WIA1002.Labs.Lab_6_Queue.Queue.Classes;

import java.util.*;

public class MyQueue<E> {
    private LinkedList<E> queueList;

    // Default constructor: initializes an empty queue
    public MyQueue() {
        queueList = new LinkedList<>();
    }

    // Constructor: takes an array and enqueues all elements
    public MyQueue(E[] elements) {
        queueList = new LinkedList<>();
        for (E e : elements) {
            enqueue(e);
        }
    }

    public void enqueue(E e) {
        queueList.addLast(e);
    }

    public E dequeue() {
        if (queueList.isEmpty()) {
            System.out.println("Queue list is empty");
            return null;
        }

        return queueList.removeFirst();
    }

    public E getElement(int i) {
        if (i > queueList.size()) {
            System.out.println("Index out of bound");
            return null;
        }

        return queueList.get(i);
    }

    public E peek() {
        if (queueList.isEmpty()) {
            System.out.println("Queue list is empty");
            return null;
        }
        return queueList.peek();
    }

    public int getSize() {
        return queueList.size();
    }

    public boolean contains(E e) {
        return queueList.contains(e);
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    @Override
    public String toString() {
        return queueList.toString();
    }

}
