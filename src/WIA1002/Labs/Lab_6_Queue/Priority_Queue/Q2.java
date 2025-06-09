package WIA1002.Labs.Lab_6_Queue.Priority_Queue;

import java.util.*;
/*
    Create two priority queues with the following elements: {"George", "Jim", "John",
    "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"}.
    Find their union, difference, and intersection. 
*/

public class Q2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        PriorityQueue<String> pq2 = new PriorityQueue<String>();

        Collections.addAll(pq1, "George", "Jim", "John", "Blake", "Kevin", "Michael");
        Collections.addAll(pq2, "George", "Katie", "Kevin", "Michelle", "Ryan");

        // Union
        PriorityQueue<String> union = new PriorityQueue<String>(pq1);
        union.addAll(pq2);
        System.out.println("Union: " + union + "\n");

        // Difference
        PriorityQueue<String> difference = new PriorityQueue<String>(pq1);
        difference.removeAll(pq2);
        System.out.println("Difference: " + difference + "\n");

        // Intersection
        PriorityQueue<String> intersection = new PriorityQueue<String>(pq1);
        intersection.retainAll(pq2);
        System.out.println("Intersection: " + intersection + "\n");

    }
}
