## Binary Tree

### Types of Binary Tree

- **Full Binary Tree**
  Every node either has 0 or 2 children.
  <img src="https://cdn.programiz.com/sites/tutorial2program/files/full-binary-tree_0.png" alt="Description" height="200">

- **Complete Binary Tree**
  All levels completely filled except last level. The last level has all nodes in left as possible.
  <img src="https://cdn.programiz.com/sites/tutorial2program/files/comparison-4.png" alt="Description" height="200">

- **Perfect Binary Tree**
  All levels are at the level.
  <img src="https://www.programiz.com/sites/tutorial2program/files/perfect-binary-tree_0.png" alt="Description" height="150">

- **Balanced Binary Tree**
  Height of the tree at max log(n) nodes.
  <img src="https://www.programiz.com/sites/tutorial2program/files/perfect-binary-tree_0.png" alt="Description" height="150">

- **Degenerate Binary Tree**
  Every internal node has one child.
  <img src="https://cdn.programiz.com/sites/tutorial2program/files/degenerate-binary-tree_0.png" alt="Description" height="200">

---

### Binary Tree Representation in Java

```
class TreeNode<E> {
    E val;
    TreeNode<E> left, right;

    TreeNode(E val) {
        this.val = val;
        this.left = this.right = null;
    }
}

/*
        1
      /   \
     2     3
    / \   / \
   4   5 6   7
*/

public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(1);
    root.left = new TreeNode<Integer>(2);
    root.right = new TreeNode<Integer>(3);

    root.left.left = new TreeNode<Integer>(4);
    root.left.right = new TreeNode<Integer>(5);

    root.right.left = new TreeNode<Integer>(6);
    root.right.right = new TreeNode<Integer>(7);
}
```

---

### Tree Traversal Techniques

<div style="display: flex; justify-content: center; gap: 20px;">

  <div style="text-align: center;">
    <img src="https://www.programiz.com/sites/tutorial2program/files/perfect-binary-tree_0.png" alt="Figure 1" height="250">
    <div><strong>Figure 1</strong></div>
  </div>

  <div style="text-align: center;">
    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Binary_tree_v2.svg/1200px-Binary_tree_v2.svg.png" alt="Figure 2" height="250">
    <div><strong>Figure 2</strong></div>
  </div>

</div>

- **DFS (Depth-First Search)**
  Types of DFS

  - Inorder Traversal (**Left + Root + Right**) – Root is visited in the middle
    **Figure 1:** `4 2 5 1 6 3 7`
    **Figure 2:** `2 7 5 6 11 1 5 9 9`
  - Pre-order Traversal (**Root + Left + Right**) - Root is visited first  
    **Figure 1:** `1 2 4 5 3 6 7`
    **Figure 2:** `1 7 2 6 5 11 9 9 5`
  - Post-order Traversal (**Left + Right + Root**) - Root is visited last
    **Figure 1:** `4 5 2 6 7 3 1`
    **Figure 2:** `2 5 11 6 7 5 9 9 1`

- **BFS (Breadth-First Search)**
  w..

---
