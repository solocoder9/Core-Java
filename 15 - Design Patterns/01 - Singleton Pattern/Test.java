class Singleton {
    // The single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Static method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class Test {
	public static void main(String[] args) {
        // Get the only instance of Singleton
        Singleton singleton = Singleton.getInstance();
        
        // Show message
        singleton.showMessage();
    }
}
