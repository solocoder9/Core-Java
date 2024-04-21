import java.io.PrintWriter;

class Example {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello");
    }
}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        Unhandled exception type FileNotFoundException

        at Example.main(Example.java:5)
 */