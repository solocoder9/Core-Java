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
public class Example2 extends B{
   
    void method5() {
        System.out.println("method-5");
    }

    void method6() {
        System.out.println("method-6");
    }
}
