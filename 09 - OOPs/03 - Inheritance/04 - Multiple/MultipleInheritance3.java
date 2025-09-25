interface Interface1 {
    default void m1() {
        System.out.println("Default m1() from Interface1");
    }
}

interface Interface2 {
    default void m1() {
        System.out.println("Default m1() from Interface2");
    }
}

public class MultipleInheritance3 implements Interface1, Interface2 {
    @Override
    public void m1() {
        Interface1.super.m1(); // Call default method from Interface1
        Interface2.super.m1(); // Call default method from Interface2
        System.out.println("Custom m1() implementation in MultiInheritanceClass");
    }

    public static void main(String[] args) {
        MultipleInheritance3 obj = new MultipleInheritance3();
        obj.m1();
    }
}
