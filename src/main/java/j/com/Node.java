package j.com;

public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node left;
    public Node right;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
