public class Test2 {
    public static void main(String[] args) {
        Thread.sleep(1000);
        System.out.println("I slept very happily");
    }
}

/* 
Compile-tiem Error:-
Test1.java:3: error: unreported exception InterruptedException; must be caught or declared to be thrown
        Thread.sleep(1000);

- In our program, the Thread.sleep(1000) method call might throw an InterruptedException, 
  which is a checked exception. Therefore, we need to either catch the exception using a try-catch 
  block or declare that the method throws InterruptedException.
*/