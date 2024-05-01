public class Test1 {
    static void doMoreStuff() {
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
Test1.java:3: error: unreported exception InterruptedException; must be caught or declared to be thrown
        Thread.sleep(1000);

In this program, the Thread.sleep(1000) method call in the doMoreStuff method might throw an InterruptedException.
The doStuff method calls doMoreStuff, so it also might throw an InterruptedException.
Similarly, the main method calls doStuff, so it might also throw an InterruptedException.
Since we are not handling the InterruptedException in any of these methods, the method signatures 
should declare that they throw InterruptedException.
*/