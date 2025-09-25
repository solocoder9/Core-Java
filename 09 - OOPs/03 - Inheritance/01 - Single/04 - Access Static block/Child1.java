class Parent {
	// Instance block
	{
		System.out.println("Super-class instance block");
	}
	
	// Static block
	static {
		System.out.println("Super-class static block");
	}
}

public class Child1 extends Parent {
	// Instance block
	{
		System.out.println("Sub-class instance block");
	}
	
	// Static block
	static {
		System.out.println("Sub-class static block");
	}

	// Main method
	public static void main(String[] args) {
		new Child1();
		new Child1();
	}
}

/*
 * Output:-
 * Super-class static block
 * Sub-class static block
 * Super-class instance block
 * Sub-class instance block
 * Super-class instance block
 * Sub-class instance block
 */
