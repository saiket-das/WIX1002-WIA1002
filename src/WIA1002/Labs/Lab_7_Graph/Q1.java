package WIA1002.Labs.Lab_7_Graph;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        WeightedGraph<Character> weighedGraph = new WeightedGraph<>();

        weighedGraph.addEdge('A', 'B', 10);
        weighedGraph.addEdge('A', 'C', 5);
        weighedGraph.addUndirectedEdge('B', 'C', 15);
        weighedGraph.addUndirectedEdge('B', 'D', 100);
        weighedGraph.printGraph();

        System.out.println("----------------------------");
        weighedGraph.removeEdge('B', 'D');
        weighedGraph.removeEdge('B', 'E');
        weighedGraph.printGraph();
    }

    static class WeightedGraph<E> {
        private Map<E, ArrayList<List<Object>>> adjList;

        WeightedGraph() {
            adjList = new HashMap<>();
        }

        // Add Directed Edge
        public void addEdge(E src, E des, int weight) {
            // Initialize the adjacency list for source and destination vertex
            // if it doesn't exist

            if (!adjList.containsKey(src)) {
                adjList.put(src, new ArrayList<>());
            }

            if (!adjList.containsKey(des)) {
                adjList.put(des, new ArrayList<>());
            }

            for (List<Object> existingPair : adjList.get(src)) {
                if (existingPair.get(0).equals(des)) {
                    System.out.println("Pair already exists");
                    return;
                }
            }

            ArrayList<Object> newPair = new ArrayList<>();
            newPair.add(des);
            newPair.add(weight);

            adjList.get(src).add(newPair);
        }

        // Add Undirected Edge
        public void addUndirectedEdge(E src, E des, int weight) {
            addEdge(src, des, weight);
            addEdge(des, src, weight);
        }

        // Q2 - Remove edge
        public boolean removeEdge(E src, E des) {
            // Check if the source vertex and destination exists in the adjacency list
            if (!adjList.containsKey(src)) {
                System.out.println("Soruce (" + src + ") not found!");
                return false;
            }

            // Retrieve the list of edges from the source vertex
            if (!adjList.containsKey(des)) {
                System.out.println("Destination (" + des + ") not found!");
                return false;
            }

            // If edges exist, remove any edge whose destination matches `des`
            ArrayList<List<Object>> edges = adjList.get(src);
            if (edges != null) {
                edges.removeIf(edge -> edge.get(0).equals(des));
            }

            return true;
        }

        // Print Graph
        public void printGraph() {
            System.out.println("Print Graph:");
            for (E vertex : adjList.keySet()) {
                System.out.print(vertex + " → ");
                for (List<Object> neighbour : adjList.get(vertex)) {
                    System.out.print("(" + neighbour.get(0) + ", " + neighbour.get(1) + ") ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
