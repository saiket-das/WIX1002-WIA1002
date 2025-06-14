package WIA1002.Labs.Lab_10_BST;

import WIA1002.Labs.Lab_10_BST.classes.TreeNode;
import static WIA1002.Labs.Lab_10_BST.classes.BST.*;

public class Q3 {
    public static void main(String[] args) {
        TreeNode<Integer> root = null;

        root = insert(root, 50);

        // Left
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);

        // Right
        root = insert(root, 70);
        root = insert(root, 80);
        root = insert(root, 90);

        // Search elements
        boolean found = search(root, 30);
        boolean notFound = search(root, 100);

        System.out.println("Found 30? " + found);
        System.out.println("Found 100? " + notFound);

        // Total number of nodes
        System.out.println("Total Nodes: " + getSize(root));

        // Height of the Tree
        System.out.println("Height of the Tree: " + height(root));

        // Min Value
        System.out.println("Min value: " + minValue(root));

        // Max Value
        System.out.println("Max value: " + maxvalue(root));

        // a path from the root leading to the specified element
        System.out.println("Root to 90 Paths: " + path(root, 90));

    }
}
