// with inheritance

class A {
    void method1() {
        System.out.println("method-1");
    }
    void method2() {
        System.out.println("method-2");
    }
}

class B extends A {

    void method3() {
        System.out.println("method-3");
    }

    void method4() {
        System.out.println("method-4");
    }
}

class C extends B{
   
    void method5() {
        System.out.println("method-5");
    }

    void method6() {
        System.out.println("method-6");
    }
}

public class Example3 {
    public static void main(String[] args) {

        // Creating object of A class (Father)
        A a1 = new A();
        a1.method1();
        a1.method2();

        System.out.println();

        // Creating object of B class (child of A class)
        B b1 = new B();
        b1.method1();
        b1.method2();
        b1.method3();
        b1.method4();

        System.out.println();
        
        // Creating object of B class (child of A class)
        C c1 = new C();
        c1.method1();
        c1.method2();
        c1.method3();
        c1.method4();
        c1.method5();
        c1.method6();
        
    }
}
