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
    public TreeNode invertTree(TreeNode root) {
        List<TreeNode> stack = new ArrayList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            var node = stack.remove(stack.size() - 1);
            if (node == null) continue;
            var tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            stack.add(node.left);
            stack.add(node.right);
        }
        return root;
    }
}
// @leet end
