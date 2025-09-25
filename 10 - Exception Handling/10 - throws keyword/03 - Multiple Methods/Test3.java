public class Test3 {
    static void doMoreStuff() throws InterruptedException {
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
No Compile-time Error

- In this program, both the doMoreStuff and doStuff methods might throw an InterruptedException, so they declare that they throw this exception.
- The main method also might throw an InterruptedException because it calls doStuff, which might throw the exception.
- We are declaring that the main method throws InterruptedException to propagate the exception to the caller, rather than handling it here.
*/