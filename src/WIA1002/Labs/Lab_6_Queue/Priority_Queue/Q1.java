package WIA1002.Labs.Lab_6_Queue.Priority_Queue;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        int[] nums = { 4, 8, 1, 2, 9, 6, 3, 7 };

        for (int num : nums) {
            pq.add(num);
        }

        // toString()
        System.out.println("1. toString() - Display all the elements inside this priority queue");
        System.out.println(pq + "\n");

        // poll()
        System.out.println("2. poll() – retrieve and remove the first element in this priority queue.");
        System.out.println(pq.poll() + "\n");

        // add()
        System.out.println("3. add() – add new element 5 into the priority queue");
        System.out.println(pq.add(5) + "\n");

        // toArray()
        Object[] numList = pq.toArray();
        System.out.println("4. toArray() – convert the priority queue into an array and display.");
        System.out.println(Arrays.toString(numList) + "\n");

        // peek()
        System.out.println("5. peek() – retrieve the first element in the priority queue.");
        System.out.println(pq.peek() + "\n");

        // contains()
        System.out.println("6. contains() – check if the priority queue consists of element “1”.");
        System.out.println(pq.contains(1) + "\n");

        // size()
        System.out.println("7. size() – get the current size of the priority queue.");
        System.out.println(pq.size() + "\n");

        // isEmpty()
        System.out.println("8. isEmpty() – display while removing the elements in the queue until it is");
        System.out.println(pq.isEmpty() + "\n");

        // sort()
        System.out.println("9. Sort the priority queue in reversing order.");
        ArrayList<Integer> list = new ArrayList<Integer>(pq);
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
