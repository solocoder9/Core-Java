public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000); // This line might throw an InterruptedException
    }
}

/* 
In our program, the Thread.sleep(1000) method call might throw an InterruptedException, 
which is a checked exception. We are declaring that the main method throws InterruptedException, 
which means that any code calling the main method must handle or declare to throw InterruptedException.
*/
