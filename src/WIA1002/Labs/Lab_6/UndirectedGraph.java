package WIA1002.Labs.Lab_6;

import java.util.*;

public class UndirectedGraph {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();

        // Adjacency ArrayList
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int u = input.nextInt();
            int v = input.nextInt();
            input.nextLine();

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Print the adjacency list
        System.out.println("\nAdjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Node " + i + ": " + adjList.get(i));
        }

        input.close();
    }
}
