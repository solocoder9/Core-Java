public class Test1 {
    static void doMoreStuff() throws InterruptedException{
        Thread.sleep(1000);
    }

    static void doStuff() {
        doMoreStuff();
    }

    public static void main(String[] args) {
        doStuff();
    }
}

/* 
Compile-time Error:-
Test1.java:7: error: unreported exception InterruptedException; must be caught or declared to be thrown
        doMoreStuff();

In this program, the doMoreStuff method might throw an InterruptedException, so it declares that it throws this exception.
The doStuff method calls doMoreStuff, so it also might throw an InterruptedException.
Similarly, the main method calls doStuff, so it might also throw an InterruptedException.
Since the InterruptedException is a checked exception, the methods should either handle it using
a try-catch block or declare that they throw InterruptedException.
*/