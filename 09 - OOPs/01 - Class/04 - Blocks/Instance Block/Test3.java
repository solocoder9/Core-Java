public class Test3 {
    
    // Constructor
    Test3() {
        this(10);
        System.out.println("0-arg constructor");
    }

    // Constructor
    Test3(int a) {
        System.out.println("1-arg constructor");
    }

    // Instance block
    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        
        new Test3(); // instance, 1-arg, 0-arg
    }

    /*
     * Instance block exicution is depends on object creation.
     */
}
