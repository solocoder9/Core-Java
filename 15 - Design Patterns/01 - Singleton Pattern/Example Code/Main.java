package ExampleCode;

public class Main {
	public static void main(String[] args) {
		// Get the only instance of Singleton
		Singleton singleton = Singleton.getInstance();

		// Show message
		singleton.showMessage();
	}
}
