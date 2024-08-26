class Parent {
    int a = 10;
    int b = 20;
}

class Child extends Parent {
    int a = 100;
    int b = 200;

    void disp(int a, int b) {
        System.out.println(a + b); // local variables
        System.out.println(this.a + this.b); // current class variabls
        System.out.println(super.a + super.b); // super class variables
    }
}

public class SuperThisKeyword {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.disp(1000, 2000);
    }
}
