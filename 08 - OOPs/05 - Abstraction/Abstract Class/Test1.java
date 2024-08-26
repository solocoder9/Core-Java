abstract class Test2 {
	abstract void m1();

	abstract void m2();

	abstract void m3();

	void m4() {
		System.out.println("m4 method");
	}
}

public class Test1 extends Test2 {
	void m1() {
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}

	void m3() {
		System.out.println("m3 method");
	}

	// Main method
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
		t1.m2();
		t1.m3();
		t1.m4();

		System.out.println(); // Print a line
		
		// Super-class type
		Test2 t2 = new Test1();
		t2.m1();
		t2.m2();
		t2.m3();
		t2.m4();
	}

}

/*
Output:-
m1 method
m2 method
m3 method
m4 method

m1 method
m2 method
m3 method
m4 method
*/