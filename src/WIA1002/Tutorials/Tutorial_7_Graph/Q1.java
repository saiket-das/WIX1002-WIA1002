package WIA1002.Tutorials.Tutorial_7_Graph;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        GraphList<Integer> intGraphList = new GraphList<>();
        intGraphList.addEdge(0, 2);
        intGraphList.addEdge(1, 3);
        intGraphList.addEdge(1, 0);
        intGraphList.addEdge(2, 4);
        intGraphList.addEdge(3, 4);
        intGraphList.addEdge(4, 5);
        intGraphList.addEdge(5, 7);
        intGraphList.addEdge(6, 7);
        intGraphList.addEdge(7, 8);
        intGraphList.printGraph();

        System.out.println("---------------");
        GraphList<Character> charGraphList = new GraphList<>();
        charGraphList.addEdge('A', 'B');
        charGraphList.addEdge('B', 'C');
        charGraphList.addEdge('B', 'D');
        charGraphList.addEdge('C', 'D');
        charGraphList.addEdge('D', 'A');
        charGraphList.printGraph();
    }

}

class GraphList<T> {
    private Map<T, LinkedList<T>> adjList;

    GraphList() {
        adjList = new HashMap<>();
    }

    public void addEdge(T src, T dist) {
        adjList.putIfAbsent(src, new LinkedList<>());
        adjList.putIfAbsent(dist, new LinkedList<>());
        adjList.get(src).add(dist);
        // adjList.get(dist).add(src); --> For Undirected Graph
    }

    public void printGraph() {
        for (T vertex : adjList.keySet()) {
            System.out.print(vertex + " → ");
            for (T neighbour : adjList.get(vertex)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }
}