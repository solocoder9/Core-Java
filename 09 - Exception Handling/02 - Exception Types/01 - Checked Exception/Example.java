import java.io.PrintWriter;

class Example {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello");
    }
}

/*
In an IDE:
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        Unhandled exception type FileNotFoundException

        at Example.main(Example.java:5)


In the CMD:
Example.java:5: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
        PrintWriter pw = new PrintWriter("abc.txt");
                         ^
1 error
 */