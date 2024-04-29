public class WithThrow {
    public static void main(String[] args) {
        // System.out.println(100/0);
        throw new ArithmeticException("/ by zero");
    }
}

/* 
new ArithmeticException("/ by zero"):-
Creating an exception object explicitly.

throw:-
Hand-over our created exception object to the JVM manually.
-----------------------------------------------------------

Output:-
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at WithoutThrow.main(WithoutThrow.java:4)
*/  