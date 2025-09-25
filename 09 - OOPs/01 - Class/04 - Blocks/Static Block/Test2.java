public class Test2 {
    
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
    Test2() {
        System.out.println("0-arg Constructor");
    }
    Test2(int a) {
        System.out.println("1-arg Constructor");
    }

    public static void main(String[] args) {

        new Test2();

    }
}

/*
 * Output: - 
 *  Static block - 1
 *  Static block - 2
 *  instance block - 1
 *  instance block - 2
 *  0-arg Constructor
 */
