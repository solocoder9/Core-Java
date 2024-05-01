public class Test2 {
    static void doMoreStuff() throws InterruptedException {
        Thread.sleep(1000);
    }

    static void doStuff() throws InterruptedException {
        doMoreStuff();
    }

    public static void main(String[] args) {
        doStuff();
    }
}

/* 
Compiler-time Error:-
Test2.java:11: error: unreported exception InterruptedException; must be caught or declared to be thrown
        doStuff();

- In this program, both the doMoreStuff and doStuff methods might throw an InterruptedException, so they 
  declare that they throw this exception.
- The main method calls doStuff, so it might also throw an InterruptedException.
- The InterruptedException is a checked exception, so the methods should either handle it using a 
  try-catch block or declare that they throw InterruptedException.
*/