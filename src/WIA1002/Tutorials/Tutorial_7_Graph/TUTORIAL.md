## Tutorial 7 - Graph

### Question 1

Write an adjacency matrix and an adjacency list for the following graph.

**Adjacency matrix**

| -   | A   | B   | C   | D   | E   | F   | G   | H   | I   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| A   | 0   | 0   | 1   | 1   | 0   | 0   | 0   | 0   | 0   |
| B   | 0   | 0   | 0   | 1   | 0   | 0   | 0   | 0   | 0   |
| C   | 0   | 0   | 0   | 0   | 1   | 1   | 0   | 0   | 0   |
| D   | 0   | 0   | 0   | 0   | 1   | 0   | 0   | 0   | 0   |
| E   | 0   | 0   | 0   | 0   | 0   | 0   | 1   | 0   | 0   |
| F   | 0   | 0   | 0   | 0   | 0   | 0   | 0   | 1   | 0   |
| G   | 0   | 0   | 0   | 0   | 0   | 0   | 0   | 1   | 0   |
| H   | 0   | 0   | 0   | 0   | 0   | 0   | 0   | 0   | 1   |
| I   | 0   | 0   | 0   | 0   | 0   | 0   | 0   | 0   | 0   |

**Adjacency List**

```
A → [C, D]
B → [D]
C → [E, F]
D → [E]
E → [G]
F → [H]
G → [H]
H → [I]
I → []
```

### Question 2

Represent the graph in question 1 using a 2 dimensional array. You use the adjacency matrix
or the adjacency list for this purpose?

```
int[][] graph = [
    {0, 0, 1, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 1, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 1, 1, 0, 0, 0},
    {0, 0, 0, 0, 1, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 1, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 1, 0},
    {0, 0, 0, 0, 0, 0, 0, 1, 0},
    {0, 0, 0, 0, 0, 0, 0, 0, 1},
    {0, 0, 0, 0, 0, 0, 0, 0, 0},
]
```

---

### Question 3

Write code to create the graph using linked-list representation. You use the adjacency matrix
or the adjacency list for this purpose?

```
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
```
