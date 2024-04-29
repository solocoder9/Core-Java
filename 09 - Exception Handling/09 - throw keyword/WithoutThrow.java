public class WithoutThrow {
    public static void main(String[] args) {
        System.out.println(100/0);
    }
}

/* 
In this code, the division by zero operation in the main method
causes an ArithmeticException to be thrown. The method where the
exception occurs is responsible for creating the exception object
and handing it over to the JVM for further processing. This handing
over process happens implicitly by the JVM.
-----------------------------------------------------------

Output:-
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at WithoutThrow.main(WithoutThrow.java:3)
*/