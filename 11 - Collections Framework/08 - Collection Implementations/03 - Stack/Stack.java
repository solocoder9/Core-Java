package Stack;

public class Stack {
    private Object[] array;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor to create a stack with default capacity of 10
    public Stack() {
        array = new Object[DEFAULT_CAPACITY];
        this.top = -1;  // Initially, stack is empty
    }

    // Method to add data to the stack (Push)
    public void push(Object data) {
        if (size() == array.length) {  // Check if the array is full and needs resizing
            resizeCapacity();
        }
        array[++top] = data;  // Increment top and insert data at the new top
    }

    // Method to remove the data from the stack (Pop)
    public Object pop() throws Exception {
        if (top == -1) {  // Stack is empty, can't pop any element
            throw new Exception("Stack is empty");
        }
        Object data = peek();  // Get the top element
        top--;  // Decrement top, effectively removing the top element

        return data;  // Return the popped element
    }

    // Method to get the top element (Peek)
    public Object peek() throws Exception {
        if (top == -1) {  // Stack is empty, can't peek any element
            throw new Exception("Stack is empty");
        }
        return array[top];  // Return the top element
    }

    // Method to get the size of the stack
    public int size() {
        return top + 1;  // Size is the number of elements (top index + 1)
    }

    // Method to check if the stack is empty
    public boolean empty() {
        return top == -1;  // Stack is empty if top is -1
    }

    // Method to resize the stack when it exceeds capacity
    public void resizeCapacity() {
        int newCapacity = (int) (array.length * 1.5);  // Increase capacity by 50%
        Object[] newArr = new Object[newCapacity];  // Create a new array with the new capacity
        System.arraycopy(array, 0, newArr, 0, size());  // Copy the elements to the new array
        array = newArr;  // Replace the old array with the new one
    }

    // Method to search for an element in the stack
    public int search(Object data) {

        for (int i = 0; i < size(); i++) {
            if (array[i].equals(data)) {  // If element matches, return 1-based index
                return i + 1;
            }
        }
        return -1;  // Return -1 if the element is not found
    }
}
