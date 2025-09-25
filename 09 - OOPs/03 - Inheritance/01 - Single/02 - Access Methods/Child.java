class Parent {
    void m1() {
        System.out.println("Super-class m1 method");
    }
}

public class Child extends Parent {
    void m1() {
        System.out.println("Sub-class m1 method");
    }

    void m2() {
        m1();
        m1();
    }

    // Main method
    public static void main(String[] args) {
        new Child().m2();
    }
}

/*
 * Output:-
 * Sub-class m1 method
 * Sub-class m1 method
 */
