package ArrayList;

public class ArrayList {
    private Object[] array; 
    private int size; 
    private static final int DEFAULT_CAPACITY = 10; 

    // Constructor to initialize the array with the default capacity
    public ArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Method to add an element to the array list
    public void add(Object element) {
        if (size == array.length) {
            resizeCapacity(); // If the array is full, resize it
        }
        array[size++] = element; // Add the element and increase the size
    }

    // Method to get an element at a specific index
    public Object get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        return array[index]; // Return the element at the given index
    }

    // Method to remove an element at a specific index
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }

        // Shift all elements to the left from the removal index
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null; // Set the last element to null
    }

    // Method to check if the array list contains a specific element
    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {

            // Avoid NullPointerException by handling null values explicitly
            if (element == null && data[i] == null) {
                return true;
            }
            if (element != null && element.equals(data[i])) {
                return true;
            }
        }
        return false; // If element is not found, return false
    }

    // Method to resize the internal array when it's full (Ensure Capacity)
    private void resizeCapacity() {
        int newCapacity = (int) (array.length * 1.5); // 1.5x the capacity
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size); // Copy existing elements to the new array
        array = newArray; // Assign the new array to the original array reference
    }

    // Method to get the current size (number of elements)
    public int size() {
        return size;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to clear the array list
    public void clear() {
        array = new Object[DEFAULT_CAPACITY]; // Reset to the default capacity
        size = 0; // Reset the size
    }
}
