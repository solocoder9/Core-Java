public class Test2 extends RuntimeException {
    public static void main(String[] args) {
        throw new Test2(); 
    }
}

/* 
Runtime Exception:
Exception in thread "main" Test2
        at Test2.main(Test2.java:3)

- Extending RuntimeException allows us to throw instances of Test2 without
  requiring a try-catch block or declaring the method to throw an exception.
*/
