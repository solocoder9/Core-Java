import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("text.txt")) {
            fw.write("Hello, World!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

/* 
try with resources
------------------
- In Java, the try-with-resources statement is a try statement that declares one or more 
  resources. A resource is an object that must be closed after the program is finished with it. 
- The try-with-resources statement ensures that each resource is closed at the end of the statement.
*/