class Singleton {
	// The single instance of the class
	private static Singleton instance;

	// Private constructor to prevent instantiation
	private Singleton() {
	}

	// Static method to get the instance of the class
	// Thread-safe, lazy initialization
	public static Singleton getInstance() {
		if (instance == null) { // First check (no locking)
			synchronized (Singleton.class) {
				if (instance == null) { // Second check (with locking)
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

	// Example method
	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}
}

public class Main {
	public static void main(String[] args) {
		// Get the only instance of Singleton
		Singleton singleton = Singleton.getInstance();

		// Show message
		singleton.showMessage();
	}
}
