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
    private int good(TreeNode node, int max) {
        if (node == null) return 0;
        int res = 0;
        if (node.val >= max) {
            res++;
            max = node.val;
        }
        int left = good(node.left, max);
        int right = good(node.right, max);
        return res + left + right;
    }

    public int goodNodes(TreeNode root) {
        return good(root, Integer.MIN_VALUE);
    }
}
// @leet end
