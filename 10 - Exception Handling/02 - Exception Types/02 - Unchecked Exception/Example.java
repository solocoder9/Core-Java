public class Example {
    public static void main(String[] args) {
        System.out.println(100/0);
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / 
by zero
        at Example.main(Example.java:3)
 */