class A {
    // Step 1: Private static variable to hold the single instance
    private static A instance;

    // Step 2: Private constructor to prevent instantiation from outside
    private A() {
    }

    // Step 3: Public static method to get the instance
    public static A getInstance() {
        // If the instance is null, create a new one; else return the existing instance
        if (instance == null) {
            instance = new A();
        }
        return instance;
    }
}

public class Test2 {
    public static void main(String[] args) {
        // Attempt to create two instances of A
        A a = A.getInstance();
        A a1 = A.getInstance();

        // Check if both references point to the same instance
        System.out.println(a == a1);  // Should print true because both are the same instance
    }
}
