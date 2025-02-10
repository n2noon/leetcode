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
    int kthsmallest = -1;

    private int dfs(TreeNode node, int k) {
        if (node == null) return 0;
        int left = dfs(node.left, k);
        if (k - left == 1 && kthsmallest == -1) kthsmallest = node.val;
        int right = dfs(node.right, k-1-left);
        return 1 + left + right;
    }

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return kthsmallest;
    }
}
// @leet end
