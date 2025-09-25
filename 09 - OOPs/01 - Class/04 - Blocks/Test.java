public class Test {
    
    // Instance Block
    {
        System.out.println("Instance block");
    }

    // Static Block
    static {
        System.out.println("Static block");
    }

    // Constructor
    Test() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Test();

        /*
         * Static block exicute first 
         * Then Instance block
         * Then Constructor
         */
    }
}
