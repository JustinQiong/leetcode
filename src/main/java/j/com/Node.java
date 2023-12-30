package j.com;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node left;
    public Node right;
    public List<Node> neighbors;
    public List<Node> children;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
        this.neighbors = new ArrayList<>();
    }
}
