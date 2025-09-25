public class Test {
    
    // Instance block
    {
        System.out.println("instance block - 1");
    }
    {
        System.out.println("instance block - 2");
    }

    // Static block
    static {
        System.out.println("Static block - 1");
    }
    static {
        System.out.println("Static block - 2");
    }

    // Constructor
    Test() {
        System.out.println("0-arg Constructor");
    }
    Test(int a) {
        System.out.println("1-arg Constructor");
    }

    public static void main(String[] args) {
        new Test(); // name-less object

        System.out.println();

        new Test(10);

        /*
         * Static blocks execution depends on class loading.
         * The class is loaded only once, so static blocks 
         * are executed only once during the class loading process.
         * 
         * Execution order: first static blocks, then instance 
         * blocks, and finally constructors (Top to bottom).
         * 
         * Multiple static blocks are possible in a single class.
         */
    }
}
