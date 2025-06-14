package WIA1002.LeetCode.L10_BST;

/* https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/ */

public class ArrayToBST {
    public static void main(String[] args) {
        int[] nums = { -10, -3, 0, 5, 9 };
        TreeNode root = preOrderBST(nums, 0, nums.length - 1);

        preOrder(root);
    }

    public static TreeNode preOrderBST(int[] nums, int left, int right) {
        // Base case: no elements left to construct a subtree
        if (left > right)
            return null;

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        // Left half forms the left subtree
        node.left = preOrderBST(nums, left, mid - 1);
        // Right half forms the right subtree
        node.right = preOrderBST(nums, mid + 1, right);

        return node;
    }

    public static void preOrder(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
