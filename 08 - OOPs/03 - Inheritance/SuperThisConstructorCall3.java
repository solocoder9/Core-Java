class Parent {

    Parent() {
        System.out.println("Parent class 0-arg Constructor");
    }
}

class Child extends Parent {

    /* code generated by compiler
    Child() {
        super();
    }
     */
}

public class SuperThisConstructorCall3 {
    public static void main(String[] args) {
        new Child();
    }
}
