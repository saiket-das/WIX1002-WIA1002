package WIA1002.Labs.Lab_6;

import java.util.*;

/*
 * The addEdge method in WeightedGraph.java adds only directed edges. 
 * Create an addUndirectedEdge method that creates undirected edges. 
 * This method receives two vertices and a weight and return a boolean. 
 */

public class WeightedGraph<E> {
    private Map<E, ArrayList<List<Object>>> adjList;

    public WeightedGraph() {
        adjList = new HashMap<>();
    }

    public static void main(String[] args) {
        WeightedGraph<Integer> weightedGraph = new WeightedGraph<>();

        weightedGraph.addEdge(1, 2, 3);
        weightedGraph.addEdge(1, 3, 4);
        weightedGraph.addEdge(1, 4, 5);
        weightedGraph.addEdge(2, 3, 5);
        weightedGraph.addEdge(3, 4, 7);
    }

    // The addEdge method in WeightedGraph.java adds only directed edges.
    public boolean addEdge(E u, E v, int w) {
        for (List<Object> existingPair : adjList.get(u)) {
            if (existingPair.get(0).equals(v)) {
                return false;
            }
        }

        List<Object> newEdgePair = new ArrayList<>();
        newEdgePair.add(v);
        newEdgePair.add(w);

        adjList.get(u).add(newEdgePair);
        return true;
    }

    // The addUndirectedEdge method that creates undirected edges.
    public boolean addUndirectedEdge(E u, E v, int w) {
        boolean addedUV = addEdge(u, v, w);
        boolean addedVU = addEdge(v, u, w);

        return addedUV || addedVU;
    }
}