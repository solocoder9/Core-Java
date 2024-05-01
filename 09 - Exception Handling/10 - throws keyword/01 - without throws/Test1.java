import java.io.PrintWriter;

public class Test1 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("abc.txt");
        System.out.println("Hello");
    }
}

/* 
Test1.java:5: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        PrintWriter pw = new PrintWriter("abc.txt");
- In our program, if there is a possibility of a checked exception, we must handle that checked exception
  either by using a try-catch block or by declaring that the method throws the exception.
*/