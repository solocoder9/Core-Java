public class Test {
    
    // Instance variable
    int favNumber;

    // Initialize the favNumber using an instance block
    {
        favNumber = 9;
    }

    // Method to display the favorite number
    void disp() {
        System.out.println("Favorite number: " + favNumber);
    }

    public static void main(String[] args) {
        
        // Method call using an anonymous object
        new Test().disp();
    }

    /*
     * Instance blocks are used to execute specific logic and
     * initialize instance variables. They are executed before
     * the constructor is called. Multiple instance blocks can
     * be defined in a single class. The execution order of
     * instance blocks is top to bottom.
     */
}
