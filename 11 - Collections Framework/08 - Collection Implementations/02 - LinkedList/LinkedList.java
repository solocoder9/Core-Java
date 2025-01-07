package LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    // Method to add an element at the beginning of the list (head)
    public void addFirst(Object element) {
        Node node = new Node(element);
        if (size == 0) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // Method to add an element at the end of the list (tail)
    public void addLast(Object element) {
        Node node = new Node(element);
        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Method to add an element at a specific index
    public void addAt(Object element, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(element);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    // Method to get the first element
    public Object getFirst() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }
        return head.data;
    }

    // Method to get the last element
    public Object getLast() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }
        return tail.data;
    }

    // Method to get the element at a specific index
    public Object getAt(int index) throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }

        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Method to remove the first element
    public Object removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }
        Object element = head.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
        return element;
    }

    // Method to remove the last element
    public Object removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }
        Object element = tail.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
        return element;
    }

    // Method to remove an element at a specific index
    public Object removeAt(int index) throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is empty");
        }
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }

        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Object element = temp.next.data;
            temp.next = temp.next.next;
            size--;
            return element;
        }
    }

    // Method to remove all the elements
    public void clear() {
        head = tail = null;
        size = 0;
    }

    // Method to get the size of the linked list
    public int getSize() {
        return size;
    }

    // Method to display the LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
