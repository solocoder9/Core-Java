public class Case1 {
    static void doMoreStuff() {
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
Case1.java:3: error: unreported exception InterruptedException; must be caught or declared to be thrown
        Thread.sleep(1000);
 */