class Parent {
    int a = 1000;
    int b = 500;
}

public class Child1 extends Parent {
    int a = 100;
    int b = 50;

    void add(int a, int b) {
        System.out.println(a + b); // 15
        System.out.println(this.a + this.b); // 150
        System.out.println(super.a + super.b); // 1500
    }

    public static void main(String[] args) {
        new Child1().add(10, 5);
    }
}

/*
 * Output:-
 * 15
 * 150
 * 1500
 */