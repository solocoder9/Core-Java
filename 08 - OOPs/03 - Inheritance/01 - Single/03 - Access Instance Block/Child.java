class Parent {
	// Instance block
	{
		System.out.println("Super-class instance block");
	}
}

public class Child extends Parent {
	// Instance block
	{
		System.out.println("Sub-class instance block");
	}

	// Main method
	public static void main(String[] args) {
		new Child();
	}
}

/*
 * Output:-
 * Super-class instance block
 * Sub-class instance block
 **/
