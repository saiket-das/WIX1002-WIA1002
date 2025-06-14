package WIA1002.Labs.Lab_10_BST.classes;

// Q1
public class TreeNode<E> {
    E val;
    TreeNode<E> left, right;

    TreeNode(E val) {
        this.val = val;
        this.left = this.right = null;
    }
}
