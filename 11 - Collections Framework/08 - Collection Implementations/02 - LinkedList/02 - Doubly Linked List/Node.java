package linkedlist;

public class Node {
    Object data; // Data in the node
    Node previous; // Pointer to the previous node
    Node next; // Pointer to the next node

    // Constructor to create a new node
    public Node(Object data) {
        this.previous = this.next = null;
        this.data = data;
    }
}
