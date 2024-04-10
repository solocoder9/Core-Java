class Parent {

    Parent() {
        System.out.println("Parent class 0-arg Constructor");
    }
}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Child class 0-arg Constructor");
    }

    Child(int a) {
        super(); 
        System.out.println("Child class 1-arg Constructor");
    }
}

public class SuperThisConstructorCall {
    public static void main(String[] args) {
        new Child();
    }
}

/*
 * inside constructor this() or Super() must be the first statement
 * a constructor can contain one one constructor call either this()
 * or super() not both.
 */
