package linkedlist;

public class LinkedList {
    Node head;  // Head node of the list
    Node tail;  // Tail node of the list
    int size;   // Size of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = this.tail = null;
        size = 0;
    }

    // Method to add element at the beginning of the list (head)
    public void addFirst(Object data) {
        Node node = new Node(data);
        if (size == 0) {
            head = tail = node;  // If list is empty, head and tail are the new node
        } else {
            node.next = head;
            node.previous = null;
            head.previous = node;
            head = node;  // Update head to point to the new node
        }
        size++;  // Increase size
    }

    // Method to add the element at the end of the list (tail)
    public void addLast(Object data) {
        Node node = new Node(data);
        if (size == 0) {
            head = tail = node;  // If list is empty, head and tail are the new node
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;  // Update tail to the new node
        }
        size++;  // Increase size
    }

    // Method to add the element at a specific index
    public void addAt(Object data, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }

        if (index == 0) {
            addFirst(data);  // If index is 0, add at the beginning
        } else if (index == size) {
            addLast(data);  // If index is size, add at the end
        } else {
            Node temp = head;

            // Traverse to the index
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node node = new Node(data);

            // Insert node in the middle by updating links
            node.next = temp.next;  // Set new node's next to temp's next
            if (temp.next != null) {  // Ensure there is a node after 'temp'
                temp.next.previous = node;  // Set next node's previous to the new node
            }
            node.previous = temp;  // Set new node's previous to temp
            temp.next = node;  // Set temp's next to new node
            size++;  // Increase size
        }
    }

    // Method to get the first element of the list
    public Object getFirst() throws Exception {
        if (size == 0) {
            throw new Exception("Linked list is empty");
        }
        return head.data;  // Return head data
    }

    // Method to get the last element of the list
    public Object getLast() throws Exception {
        if (size == 0) {
            throw new Exception("Linked list is empty");
        }
        return tail.data;  // Return tail data
    }

    // Method to get element at a specific index
    public Object getAt(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }
        Node temp = head;

        // Traverse to the index
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;  // Return the data at the index
    }

    // Method to remove the first element of the list
    public Object removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception("Linked list is empty");
        }

        Object data = head.data;  // Store data to return
        if (size == 1) {
            head = tail = null;  // If only one node, set both head and tail to null
            size = 0;  // Set size to 0
        } else {
            head.next.previous = null;
            head = head.next;  // Update head to next node
            size--;  // Decrease size
        }

        return data;  // Return the removed data
    }

    // Method to remove the last element of the list
    public Object removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("Linked list is empty");
        }

        Object data = tail.data;  // Store data to return
        if (size == 1) {
            head = tail = null;  // If only one node, set both head and tail to null
            size = 0;  // Set size to 0
        } else {
            tail.previous.next = null;
            tail = tail.previous;  // Update tail to previous node
            size--;  // Decrease size
        }

        return data;  // Return the removed data
    }

    // Method to remove element at a specific index
    public Object removeAt(int index) throws Exception {
        if (size == 0) {
            throw new Exception("Linked list is empty");
        }

        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }

        if (index == 0) {
            return removeFirst();  // If index is 0, remove first element
        } else if (index == size - 1) {
            return removeLast();  // If index is last, remove last element
        } else {
            Node temp = head;

            // Traverse to the index
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            Object data = temp.data;  // Store data to return
            temp.previous.next = temp.next;  // Link previous node to the next node
            if (temp.next != null) {
                temp.next.previous = temp.previous;  // Link next node back to the previous node
            }
            size--;  // Decrease size
            return data;  // Return removed data
        }
    }

    // Method to remove all the elements of the list
    public void clear() {
        head = tail = null;  // Set both head and tail to null
        size = 0;  // Set size to 0
    }

    // Method to get the size of the linked list
    public int size() {
        return size;  // Return current size
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;

        // Traverse and print the list
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to display the linked list in reverse order
    public void displayReverse() {
        Node temp = tail;

        // Traverse and print the list in reverse order
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.previous;
        }
        System.out.println();
    }
}

