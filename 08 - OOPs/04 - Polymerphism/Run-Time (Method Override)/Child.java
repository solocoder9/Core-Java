class Parent {
    static void m1() {
        System.out.println("Super-class m1 method");
    }
}

public class Child extends Parent {
    static void m1() {
        System.out.println("Sub-class m1 method");
    }

    // Main method
    public static void main(String[] args) {
        Parent p = new Child(); // p is a reference of type Parent but points to a Child object
        p.m1(); // This will call Parent's static method m1() because the reference type is Parent
    }
}

/*
Output:
Super-class m1 method

Explanation:
- Static methods are associated with the class, not with instances of the class. Therefore, they 
  are resolved at compile-time based on the reference type, not the actual object type.
- In the statement `Parent p = new Child();`, `p` is a reference of type `Parent`. When `p.m1()` is called, 
  the static method resolution is based on the type of the reference (`Parent`), not the actual object (`Child`).
- As a result, `Parent`'s static method `m1()` is invoked, and the output is "Super-class m1 method".
*/

/*
 * This code might look like method overriding, but it is not overriding: it actually demonstrates method hiding.
 * In Java, static methods cannot be overridden. Instead, when a subclass defines a static method 
 * with the same name as a static method in the superclass, the subclass method hides the superclass method.
 * Static methods belong to the class itself rather than to instances of the class, so the method that gets 
 * called depends on the reference type, not the actual object type.
 */
