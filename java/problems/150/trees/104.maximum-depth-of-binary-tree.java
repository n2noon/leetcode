// @leet start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int dfs(TreeNode node) {
        if (node.left == null && node.right == null) return 1;
        int left = 0, right = 0;
        if (node.left != null) left = dfs(node.left);
        if (node.right != null) right = dfs(node.right);
        return 1 + Math.max(left, right);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root);
    }
}
// @leet end
