package ArrayListGeneric;

public class ArrayList<T> {
    private T[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor to initialize the array with the default capacity
    @SuppressWarnings("unchecked")
    public ArrayList() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Method to add an element to the array list
    public void add(T element) {
        if (size == data.length) {
            resizeCapacity(); // If the array is full, resize it
        }
        data[size++] = element; // Add the element and increase size
    }

    // Method to get an element at a specific index
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        return data[index];
    }

    // Method to remove an element a specific index
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        T removed = data[index];
        // Shift all elements to the left from the removal index
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null; // Set the last element to null

        return removed; // return the removed element
    }

    // Method to check if the array list contains a specific element
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            // Avoid NullPointerException by handling null values explicitly
            if (element == null && data[i] == null) {
                return true;
            }
            if (element != null && element.equals(data[i])) {
                return true;
            }
        }

        return false; // If element not found, return false
    }

    // Method to resize the internal array when it is full (1.5x growth strategy)
    @SuppressWarnings("unchecked")
    private void resizeCapacity() {
        int newCapacity = (int) (data.length * 1.5);
        T[] newData = (T[]) new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    // Method to get the current size (number of elements)
    public int size() {
        return size;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to clears the list by resetting the array and size
    @SuppressWarnings("unchecked")
    public void clear() {
        data = (T[]) new Object[DEFAULT_CAPACITY]; // Reset the default capacity
        size = 0; // Reset the size
    }
}
