// @leet start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    private Node clone(Node node, Map<Node,Node> cache) {
        if (node == null) return null;
        if (cache.containsKey(node)) return cache.get(node);
        Node clone = new Node(node.val);
        cache.put(node, clone);
        clone.next = clone(node.next, cache);
        clone.random = clone(node.random, cache);
        return clone;
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> cache = new HashMap<>();
        var node = head;
        while (clone(node, cache) != null) {
            node = node.next;
        }
        return cache.get(head);
    }
}
// @leet end
