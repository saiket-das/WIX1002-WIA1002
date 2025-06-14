package WIA1002.Labs.Lab_10_BST.classes;

import java.util.ArrayList;

// Q1
public class BST {
    // Q2 - Insert in the BST
    public static <E extends Comparable<E>> TreeNode<E> insert(TreeNode<E> root, E val) {
        if (root == null)
            return new TreeNode<>(val);

        if (val.compareTo(root.val) < 0)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    // Q2 - Search element in the BST
    public static <E extends Comparable<E>> boolean search(TreeNode<E> root, E target) {
        if (root == null) {
            return false;
        }

        int cmp = root.val.compareTo(target);
        if (cmp == 0)
            return true;

        if (cmp < 0)
            return search(root.left, target);
        else
            return search(root.right, target);
    }

    // Q2 - Total number of Nodes
    public static <E> int getSize(TreeNode<E> root) {
        if (root == null)
            return 0;

        return 1 + getSize(root.left) + getSize(root.right);
    }

    // Q2 - Height of the BST
    public static <E> int height(TreeNode<E> root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Get the root of the BST
    public static <E> E root(TreeNode<E> root) {
        if (root == null) {
            System.out.println("BST is empty!");
            return null;
        }

        return root.val;
    }

    // Q2 - Get min element in the BST
    public static <E> E minValue(TreeNode<E> root) {
        if (root == null) {
            System.out.println("BST is empty!");
            return null;
        }

        TreeNode<E> current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.val;
    }

    // Q2 - Get min element in the BST
    public static <E> E maxvalue(TreeNode<E> root) {
        if (root == null) {
            System.out.println("BST is empty!");
            return null;
        }

        TreeNode<E> current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.val;
    }

    // Get a path from the root leading to the specified element (ArrayList)
    public static <E extends Comparable<E>> ArrayList<E> path(TreeNode<E> root, E node) {
        ArrayList<E> paths = new ArrayList<>();
        TreeNode<E> current = root;

        while (current != null) {
            paths.add(current.val);

            if (node.compareTo(root.val) < 0)
                current = current.left;
            else
                current = current.right;
        }

        return paths;
    }
}
