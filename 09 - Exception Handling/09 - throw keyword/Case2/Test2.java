public class Test2 {
    public static void main(String[] args) {
        throw new ArithmeticException();
        System.out.println("Hello");
    }
}

/* 
Runtime Error:-
Test.java:4: error: unreachable statement
        System.out.println("Hello");

- After the throw statement, we can't take any statement directly.
*/