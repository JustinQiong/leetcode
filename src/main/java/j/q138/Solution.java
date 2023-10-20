package j.q138;

import j.com.Node;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Node, Node> cache = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        if (!cache.containsKey(head)) {
            Node node = new Node(head.val);
            cache.put(head, node);
            node.next = copyRandomList(head.next);
            node.random = copyRandomList(head.random);
        }

        return cache.get(head);
    }
}
