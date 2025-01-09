package Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        // Create a new Stack
        Stack stack = new Stack();

        // Push some elements onto the stack
        stack.push("Charlie");
        stack.push(99.99);
        stack.push('S');
        stack.push("Justin");
        stack.push(15);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());  // 15

        // Get the size of the stack
        System.out.println("Size of stack: " + stack.size());  // 5

        // Search for an element in the stack
        System.out.println("Position of 'Justin': " + stack.search("Justin"));  // 4

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());  // 15
        System.out.println("Popped element: " + stack.pop());  // Justin

        // Check the size after popping
        System.out.println("Size of stack after popping: " + stack.size());  // 3

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());  // false

        // Peek the top element after popping some elements
        System.out.println("Top element after popping: " + stack.peek());  // S

    }
}
