public class Case3 {
    static void doMoreStuff() {
        Thread.sleep(1000);
    }

    static void doStuff() throws InterruptedException {
        doMoreStuff();
    }

    public static void main(String[] args) throws InterruptedException {
        doStuff();
    }
}

/*
Compile-time Error:-
Case3.java:3: error: unreported exception InterruptedException; must be caught or declared to be thrown
        Thread.sleep(1000);
 */