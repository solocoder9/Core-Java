public class Test {
    static int x = 100/0;

    public static void main(String[] args) {
    }
}

/* 
Runtime Error:-
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.ArithmeticException: / by zero
        at Test.<clinit>(Test.java:2)


ExceptionInInitializerError
---------------------------
- It is an error in Java occurs when an exception is thrown during the initialization 
  of a static initializer block or the initialization of a static variable. 
- This error indicates a failure in the static initialization of a class, which can happen
  due to various reasons such as an uncaught exception thrown by a static initializer block 
  or the failure of a static initializer block to complete successfully.
- Hierarchy:-

    Throwable
        └── Error
            └── LinkageError
                    └── ExceptionInInitializerError

*/