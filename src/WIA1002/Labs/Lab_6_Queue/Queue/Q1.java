package WIA1002.Labs.Lab_6_Queue.Queue;

import WIA1002.Labs.Lab_6_Queue.Queue.Classes.MyQueue;

public class Q1 {
    public static void main(String[] args) {
        String[] fruits = { "Durian", "Blueberry", };
        MyQueue<String> fruitsQueue = new MyQueue<>(fruits);

        fruitsQueue.enqueue("Apple");
        fruitsQueue.enqueue("Orange");
        fruitsQueue.enqueue("Grape");
        fruitsQueue.enqueue("Cherry");

        System.out.println(fruitsQueue.toString());
        System.out.println("Top fruit: " + fruitsQueue.peek());
        System.out.println("Queue Size: " + fruitsQueue.getSize());

        System.out.println("Delete element: " + fruitsQueue.dequeue());

        System.out.println("2nd Index element: " + fruitsQueue.getElement(2));

        System.out.println("Contains Cherry " + fruitsQueue.contains("Cherry"));
        System.out.println("Contains Durian: " + fruitsQueue.contains("Durian"));

    }
}
