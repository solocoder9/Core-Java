enum Singleton {
	INSTANCE;

	// Example method
	public void doSomething() {
		System.out.println("Singleton using enum!");
	}
}

public class Main {
	public static void main(String[] args) {
		// Get the only instance of Singleton using the INSTANCE constant
		Singleton singletonInstance = Singleton.INSTANCE;

		// Call the method on the Singleton instance
		singletonInstance.doSomething();
	}
}
