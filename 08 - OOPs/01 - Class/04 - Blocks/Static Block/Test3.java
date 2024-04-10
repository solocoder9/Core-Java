public class Test3 {
    
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

    public static void main(String[] args) {
        
    }
}

/*
 * Output: -
 * Static block - 1
 * Static block - 2
 */
