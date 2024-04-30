public class Test1 {
    public static void main(String[] args) {
        System.out.println(100/0); // AE
        System.out.println("Hello");
    }
}

/* 
Output: 
Runtime Exception-
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:3)
*/