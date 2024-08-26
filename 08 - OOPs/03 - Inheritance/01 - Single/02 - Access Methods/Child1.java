class Parent {
    void m1() {
        System.out.println("Super-class m1 method");
    }
}

public class Child1 extends Parent {
    void m1() {
        System.out.println("Sub-class m1 method");
    }

    void m2() {
        this.m1();
        super.m1();
    }

    // Main method
    public static void main(String[] args) {
        new Child1().m2();
    }
}

/*
 * Output:-
 * Sub-class m1 method
 * Super-class m1 method
 */
