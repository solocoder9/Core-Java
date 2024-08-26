class Parent {
    void m1() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void m1() {
        System.out.println("Child class method");
    }

    void m2() {
        this.m1(); // (this is optional here)
        super.m1(); // call super class method
    }
}

public class SuperThisKeyword2 {
    public static void main(String[] args) {
        new Child().m2();
    }
}
