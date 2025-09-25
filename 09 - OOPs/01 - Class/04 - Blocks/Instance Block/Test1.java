public class Test1 {
    
    // Constructor
    Test1() {
        System.out.println("0-arg Constructor");
    }

    // Constructor 2 
    Test1(int a) {
        System.out.println("1-arg Constructor");
    }

    // Instance block
    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        
        // Object create
        new Test1(); // Instace blk, 0-arg cons
        new Test1(10); // Instance blk, 1-arg cons

        /*
         * Instance blocks are common for all the objects
         */
        
    }
}
