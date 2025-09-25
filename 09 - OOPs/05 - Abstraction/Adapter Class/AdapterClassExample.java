interface MouseListener {
	void mouseClicked();

	void mouseEntered();

	void mouseExited();

	void mousePressed();

	void mouseReleased();
}

// Adapter class (MouseAdapter)
abstract class MouseAdapter implements MouseListener {
	@Override
	public void mouseClicked() {
		// Default implementation (can be empty)
	}

	@Override
	public void mouseEntered() {
		// Default implementation (can be empty)
	}

	@Override
	public void mouseExited() {
		// Default implementation (can be empty)
	}

	@Override
	public void mousePressed() {
		// Default implementation (can be empty)
	}

	@Override
	public void mouseReleased() {
		// Default implementation (can be empty)
	}
}

class MyMouseListener extends MouseAdapter {
	@Override
	public void mouseClicked() {
		System.out.println("Mouse clicked!");
	}

	// Other mouse event methods can use default implementations
}

public class AdapterClassExample {
	public static void main(String[] args) {
		MyMouseListener listener = new MyMouseListener();

		// Simulate a mouse click
		listener.mouseClicked();
	}
}
