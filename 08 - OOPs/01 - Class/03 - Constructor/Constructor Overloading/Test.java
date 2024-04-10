public class Test {
    
    // Construtor 1
    Test(double d) {
        this(10);
        System.out.println("double-arg constuctor");
    }

    // Constructor 2
    Test(int a) {
        this();
        System.out.println("int-arg constructor");
    }

    // Constructor
    Test() {
        System.out.println("no-arg constructor");
    }

    public static void main(String[] args) {
        
        // Object Creation
        Test t1 = new Test(10.5);

        System.out.println();

        Test t2 = new Test(10);

        System.out.println();

        Test t3 = new Test();
    }
}
