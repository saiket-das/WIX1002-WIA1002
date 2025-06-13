## Binary Search Tree

### Question 1

**What is a Binary Search Tree (BST)?**
A Binary Search Tree (BST) is a type of binary tree in which each node has at most two children: a left child and a right child.  
It follows a specific property:

- The value of the left child is **less than** the parent node.
- The value of the right child is **greater than** the parent node.

---

### Question 2

**Build a BST based on the input 50, 30, 25, 71, 80, 99, 40, 1, 7, 5. Draw the final tree**

```
         50
        /  \
       30  71
      /  \   \
     25  40  80
     /        \
    1         90
     \
      7
     /
    5
```

---

### Question 3

**What is the height of the tree built in Question 2?**

Answer: 5 (5 edges)

---

### Question 4

**What is the height of the tree built in Question 2?**
**(a)** Pre-order traversal
`0100 0050 0025 0001 0030 0070 0065 0085 0150 0135 0169 0180`

**(b)** In-order traversal
`0001 0025 0030 0050 0065 0070 0085 0100 0135 0150 0169 0180`

**(c)** Post-order traversal
`0001 0030 0025 0065 0085 0070 0050 0135 0180 0169 0150 0100`

---

### Question 5

**Using the same BST in Question 4, delete the element `0030’. Draw the resulting tree.**

```
               0100
             /      \
            /        \
           /          \
         0050        0150
        /    \       /   \
      0025  0070   0135 0169
      /     /   \          \
    0010  0065 0085       0180
```

---

### Question 6

**Again, using the same BST in Question 3 (i.e., ignoring the deletion of `0030` in Question 5), delete the element `0050`. Draw the resulting tree.**

```
               0100
             /      \
            /        \
           /          \
         0065        0150
         /  \       /   \
      0025  0070   0135  0169
      /  \     \           \
    0001 0030  0085       0180
```
