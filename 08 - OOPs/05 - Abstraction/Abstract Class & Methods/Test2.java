abstract class Test1 {
	Test1() {
		System.out.println("Abstract class constructor");
	}

	abstract void m1();
}

public class Test2 extends Test1 {

	void m1() {
		System.out.println("m1() method");
	}

	// Main method
	public static void main(String[] args) {

		new Test2().m1();
	}

}

/*
Output: 
Abstract class constructor
m1() method


Note: It is possible to define a constructor in an abstract class.
*/