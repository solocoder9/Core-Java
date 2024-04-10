public class Test2 {
   
    // Constructor
    Test2() {
        System.out.println("Constructor");
    }

    // Instance block 1
    {
        System.out.println("Instance block - 1");
    }

    // Instance block 2
    {
        System.out.println("Instance block - 2");
    }

    /*
     * Multiple instance blocks can be defined 
     * in a single class.
     * 
     * The order of exicution of instance block is top to buttom.
     */

    public static void main(String[] args) {
        
        // Anonymous object
        new Test2();

        System.out.println();

        new Test2();
    }
}
