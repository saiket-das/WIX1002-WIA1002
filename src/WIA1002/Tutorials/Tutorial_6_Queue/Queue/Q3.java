package WIA1002.Tutorials.Tutorial_6_Queue.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        Scanner keyIn = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            if (keyIn.nextBoolean())
                System.out.print(i + " ");
            else
                q.add(i);
        }
        while (!q.isEmpty())
            System.out.print(q.remove() + " ");
        System.out.println();

        keyIn.close();
    }
}
