package j.q133;

import j.com.Node;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Node, Node> visited = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node copy = new Node(node.val);
        visited.put(node, copy);

        for (Node neighbour : node.neighbors) {
            copy.neighbors.add(cloneGraph(neighbour));
        }

        return copy;
    }
}
