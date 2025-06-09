package WIA1002.Tutorials.Tutorial_6_Queue.Priority_Queue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Q4 {
    public static void main(String[] args) {
        PriorityQueueComparator pqc = new PriorityQueueComparator();
        PriorityQueue<String> pq = new PriorityQueue<String>(5, pqc);
        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");
        for (String s : pq) {
            System.out.println(s);
        }
    }
}

class PriorityQueueComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}
// PriorityQueueComparator pqc = new PriorityQueueComparator();
// PriorityQueue<String> pq = new PriorityQueue<String>(5, pqc);

// pq.add("Jason");
// pq.add("Ali");
// pq.add("Muhamad");

// while (!pq.isEmpty()) {
// System.out.println(pq.poll());
// }
// }
// }

// class PriorityQueueComparator implements Comparator<String> {
// public int compare(String s1, String s2) {
// // Prioritize longer strings (reverse the logic)
// return Integer.compare(s2.length(), s1.length());
// }
// }