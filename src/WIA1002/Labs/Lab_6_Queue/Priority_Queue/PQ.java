package WIA1002.Labs.Lab_6_Queue.Priority_Queue;

import java.util.*;

public class PQ {

    public static void main(String args[]) {
        Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder());

        q.offer(3.24);
        q.offer(3.80);
        q.offer(3.53);
        q.offer(2.70);

        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        PriorityQueue();

        System.out.println("--------------");
        labQuestion3();

    }

    public static void PriorityQueue() {
        PriorityQueuCompare pqc = new PriorityQueuCompare<>();

        PriorityQueue<String> pq = new PriorityQueue<>(pqc);

        pq.offer("Noor");
        pq.offer("Bilbo");
        pq.offer("Shojib");
        pq.offer("Ahan");

        System.out.println(pq);
    }

    public static void labQuestion3() {
        PriorityQueue<String> pQueue = new PriorityQueue<>();

        pQueue.offer("C++");
        pQueue.offer("Python");
        pQueue.offer("Java");
        pQueue.offer("Fortran");

        System.out.println("(a) -> peek() gives us: " + pQueue.peek()); // (a) -> C++

        System.out.println("\n(b) -> The queue elements:"); // (b)
        Iterator itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); // (b)
            /*
             * C++
             * Fortran
             * Java
             * Python
             */
        }

        pQueue.poll();
        System.out.println("\n(c) -> After poll():"); // (c)

        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next()); // (c)
            /*
             * Fortran
             * Java
             * Python
             */
        }

        pQueue.remove("Java");
        System.out.println("\n(d) -> After remove():"); // (d)

        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next()); // (d)
            /*
             * Fortran
             * Python
             */
        }

        boolean b = pQueue.contains(" Ruby");
        System.out.println("\n(e) -> Priority queue contains Ruby or not?: " + b); // (e) -> False

        Object[] arr = pQueue.toArray();
        System.out.println("\n(f) -> Value in array: "); // (f)

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value: " + arr[i].toString()); // (f)
            /*
             * Value: Fortran
             * Value: Python
             */
        }
    }

}

class PriorityQueuCompare<E> implements Comparator<E> {

    @Override
    public int compare(E first, E second) {
        Comparable<E> f = (Comparable<E>) first;
        return f.compareTo(second);
    }
}

// OR
class PriorityQueuCom<E extends Comparable<E>> implements Comparator<E> {
    @Override
    public int compare(E first, E second) {
        return first.compareTo(second);
    }
}
