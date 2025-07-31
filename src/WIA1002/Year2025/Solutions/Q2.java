package WIA1002.Year2025.Solutions;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayQueue<String> queue = new ArrayQueue<>();
        PriorityQueue pq = new PriorityQueue();

        // ------ Part B ------
        for (int i = 0; i < 10; i++) {
            char letter = (char) ('A' + random.nextInt(26));
            String digits = String.format("%09d", random.nextInt(1000000000));

            // Combine (1 Letter + 9 Digits)
            String matrixNumber = letter + digits;
            System.out.println("Random matric number: " + matrixNumber);
            queue.enqueue(matrixNumber);
            pq.enqueue(matrixNumber);
        }

        System.out.println(queue);
        System.out.println(pq);

    }
}

// ------ Part A ------
class ArrayQueue<T> {
    private static final int MAX_CAPACITY = 8;
    private Object[] data;
    private int front, rear, size;

    public ArrayQueue() {
        data = new Object[MAX_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue: add to rear, replace oldest if full
    public void enqueue(T item) {
        if (size == MAX_CAPACITY) {
            // Replace oldest: move front forward
            front = (front + 1) % MAX_CAPACITY;
            rear = (rear + 1) % MAX_CAPACITY;
            data[rear] = item;
        } else {
            rear = (rear + 1) % MAX_CAPACITY;
            data[rear] = item;
            size++;
        }
    }

    // Dequeue: remove from front
    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        @SuppressWarnings("unchecked")
        T item = (T) data[front];
        front = (front + 1) % MAX_CAPACITY;
        size--;
        return item;
    }

    // toString: display elements from front to rear
    public String toString() {
        StringBuilder sb = new StringBuilder("\nQueue: ");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % MAX_CAPACITY;
            sb.append(data[idx]);
            if (i < size - 1)
                sb.append(", ");
        }
        return sb.toString();
    }
}

// ------ Part C ------
class PriorityQueue {
    private static final int MAX_CAPACITY = 8;
    private String[] data;
    private int size;

    public PriorityQueue() {
        data = new String[MAX_CAPACITY];
        size = 0;
    }

    public void enqueue(String item) {
        if (size == MAX_CAPACITY) {
            System.out.println("PriorityQueue is full! Replaced " + data[0]);
            // Remove the oldest (front), shift left
            for (int i = 1; i < MAX_CAPACITY; i++) {
                data[i - 1] = data[i];
            }
            data[MAX_CAPACITY - 1] = item;
        } else {
            data[size++] = item;
        }
        sort();
    }

    private void sort() {
        Arrays.sort(data, 0, size, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // First char ascending
                int cmp = Character.compare(a.charAt(0), b.charAt(0));
                if (cmp != 0)
                    return cmp;
                // Digits descending
                String digitsA = a.substring(1);
                String digitsB = b.substring(1);
                return digitsB.compareTo(digitsA);
            }
        });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nPriorityQueue: ");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1)
                sb.append(", ");
        }
        return sb.toString();
    }
}