package Queue;

public class Queue {
    private Object[] array;  // Array to store elements
    private int front;       // Points to the front element
    private int rear;        // Points to the rear element
    private int size;        // The current size of the queue
    private static final int DEFAULT_CAPACITY = 10;  // Default capacity of the queue

    // Constructor to create a queue with default capacity
    public Queue() {
        array = new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Enqueue method: Adds an element to the back of the queue
    public void enqueue(Object data) {
        if (size == array.length) {
            resizeCapacity();
        }
        array[rear] = data;
        rear = (rear + 1) % array.length;  // Circular increment
        size++;
    }

    // Dequeue method: Removes and returns the element at the front of the queue
    public Object dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        Object data = array[front];
        front = (front + 1) % array.length;  // Circular increment
        size--;
        return data;
    }

    // Peek method: Returns the front element without removing it
    public Object peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return array[front];
    }

    // Size method: Returns the number of elements in the queue
    public int size() {
        return size;
    }

    // IsEmpty method: Checks if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Resize method: Resizes the array when the queue is full
    private void resizeCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[(front + i) % array.length];  // Circular copying
        }
        front = 0;
        rear = size;
        array = newArray;
    }
}
