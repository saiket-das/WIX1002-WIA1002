package WIA1002.Labs.Lab_7_Graph.Classes;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {

        UnWeightedGraph<String> unWeightedGraph = new UnWeightedGraph<>();

        unWeightedGraph.addEdge("Dhaka", "Sylhet");
        unWeightedGraph.addUndirectedEdge("Dhaka", "Chittaging");
        unWeightedGraph.addUndirectedEdge("Sylhet", "Sunamganj");
        unWeightedGraph.addUndirectedEdge("Sylhet", "Sreemangal");
        unWeightedGraph.addUndirectedEdge("Sreemangal", "Sunamganj");

        unWeightedGraph.printGraph();
    }
}

class UnWeightedGraph<E> {
    private Map<E, ArrayList<E>> adjList;

    UnWeightedGraph() {
        adjList = new HashMap<>();
    }

    public boolean addEdge(E src, E des) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(des, new ArrayList<>());

        if (!adjList.get(src).contains(des)) {
            adjList.get(src).add(des);
        } else {
            System.out.println("Edge from " + src + " to " + des + " already exists.");
            return false;
        }

        return true;
    }

    public boolean addUndirectedEdge(E src, E des) {
        addEdge(src, des);

        if (!adjList.get(des).contains(src)) {
            adjList.get(des).add(src);
        } else {
            System.out.println("Edge from " + des + " to " + src + " already exists.");
            return false;
        }
        return true;
    }

    // Print Graph
    public void printGraph() {
        System.out.println("-----------");
        System.out.println("Print Graph");
        System.out.println("-----------");
        for (E vertex : adjList.keySet()) {
            System.out.print(vertex + " → ");
            for (E neighbour : adjList.get(vertex)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
