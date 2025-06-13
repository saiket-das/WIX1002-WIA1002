package WIA1002.Tutorials.Tutorial_10_BST;

/* Build a BST based on the input 50, 30, 25, 71, 80, 99, 40, 1, 7, 5. Draw the final tree. */

/*
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
*/

public class BinaryTree {
    public static void main(String[] args) {
        int[] values = { 50, 30, 25, 71, 80, 99, 40, 1, 7, 5 };

        TreeNode root = null;
        for (int val : values) {
            root = insert(root, val);
        }

        inOrder(root); // 1 5 7 25 30 40 50 71 80 99

        System.out.println();
    }

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    // Print in order
    public static void inOrder(TreeNode node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
}
