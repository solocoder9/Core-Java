class Parent {
    int a = 1000;
    int b = 500;
}

public class Child extends Parent {
    int a = 100;
    int b = 50;

    void add(int a, int b) {
        System.out.println(a + b); // 15
        System.out.println(a + b); // 15
        System.out.println(a + b); // 15
    }

    public static void main(String[] args) {
        new Child().add(10, 5);
    }
}

/*
 * Output:-
 * 15
 * 15
 * 15
 */