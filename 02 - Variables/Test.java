public class Test {

	int a = 100; // instance variable
	static int b = 200; // static variable
	
	// Instance method
	void m1 () { 
		System.out.println(a);	
		System.out.println(Test.b);
	}
	
	// Static method
	public static void main(String[] args) {
		
		int c = 300; // local variable
		Test t = new Test();
		
		System.out.println(t.a); // 100
		System.out.println(Test.b); // 200
		System.out.println(c); // 300
		
	}
}

/*
- In the static area (e.g., static methods like main), static variables (e.g., `b`) can be 
  accessed directly. 
- Instance variables (e.g., `a`) must be accessed through an instance of the class (e.g., `t.a`).

- In instance methods (e.g., `m1`), both instance variables (e.g., `a`) and static variables (e.g., `b`) 
  can be accessed directly. 
- Local variables (e.g., `c` in `main`) are only accessible within the block they are declared.
*/
