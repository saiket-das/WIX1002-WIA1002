package WIA1002.LeetCode.L10_BST;

import java.util.ArrayList;
import java.util.List;

/* https://leetcode.com/problems/binary-tree-inorder-traversal/ */
public class InOrderBST {
    public static void main(String[] agrs) {
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inOrder(ans, root);

        return ans;
    }

    public static void inOrder(List<Integer> ans, TreeNode root) {
        if (root == null)
            return;

        inOrder(ans, root.left);
        ans.add(root.val);
        inOrder(ans, root.right);
    }
}
