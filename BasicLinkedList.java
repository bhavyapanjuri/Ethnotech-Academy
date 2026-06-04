public class Node {
    int data;       // Holds the value
    Node next;      // Reference to the next Node object

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null; // Defaults to null until linked
    }
}