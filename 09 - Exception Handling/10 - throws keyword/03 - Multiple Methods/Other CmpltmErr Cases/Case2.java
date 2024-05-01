public class Case2 {
    static void doMoreStuff() throws InterruptedException {
        Thread.sleep(1000);
    }

    static void doStuff() {
        doMoreStuff();
    }

    public static void main(String[] args) throws InterruptedException {
        doStuff();
    }
}

/*
Compile-time Error:-
Case3.java:7: error: unreported exception InterruptedException; must be caught or declared to be thrown
        doMoreStuff();
 */