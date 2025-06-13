package WIA1002.PastYears.WIA1002_2020_1;

import java.util.*;
/* Write a program to implement generic queue.  */

public class Q2 {
    public static void main(String[] args) {
        GenericQueue<String> q = new GenericQueue<String>();
        q.enqueue("Dom T");
        q.enqueue("Rafa N");
        System.out.println();
        q.enqueueMany(new String[] {
                "Roger F", "Daniil M", "Novak D", "Alex Z", "Stef T", "Karen K"
        });
        System.out.println();

        q.display();
        System.out.println();

        q.dequeue();
        System.out.println();

        q.enqueue("Matt B");
        q.enqueue("Kei N");
        System.out.println();

        q.display();
        System.out.println();

        q.dequeueAll();
        System.out.println();

        q.display();
        System.out.println();

        System.out.println("----------");

        GenericQueue<Integer> q2 = new GenericQueue<Integer>(10);
        q2.enqueue(10);
        q2.enqueue(20);
        System.out.println();

        q2.enqueueMany(new Integer[] { 10, 20, 30, 45 });
        System.out.println();

        q2.display();
        System.out.println();

        q2.changeOrder(5);
        System.out.println();

        q2.display();
    }
}

/*
 * 
 * ii) isEmpty
 * iii) isFull
 * iv) peek
 * v) enqueue
 * vi) dequeue
 * vii) changeOrder
 */
class GenericQueue<E> {
    LinkedList<E> list;

    GenericQueue() {
        list = new LinkedList<>();
    }

    GenericQueue(E e) {
        list = new LinkedList<>();
        list.addLast(e);
    }

    public void enqueue(E e) {
        System.out.println("Enqueue: " + e);
        list.addLast(e);
    }

    public void silentenqueue(E e) {
        list.addLast(e);
    }

    public void enqueueMany(E[] elements) {
        for (E e : elements) {
            enqueue(e);
        }
    }

    public E dequeue() {
        System.out.println("Dequeue: " + list.getFirst());
        return list.removeFirst();
    }

    public E silentDequeue() {
        return list.removeFirst();
    }

    public void dequeueAll() {
        System.out.println("There are " + list.size() + " items in the queue. Removing them all...");
        while (!list.isEmpty()) {
            dequeue();
        }
    }

    public E peek() {
        System.out.println("Peek: " + list.getFirst());
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void changeOrder(int n) {
        System.out.println("Change queue order...");
        for (int i = 0; i < n; i++) {
            E temp = silentDequeue();
            if (temp != null) {
                silentenqueue(temp);
            }
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Nothing to display");
            return;
        }

        System.out.println("There are " + list.size() + " items in the queue. Displaying...");
        for (E e : list) {
            System.out.print(e + " | ");
        }
        System.out.println();
    }
}
