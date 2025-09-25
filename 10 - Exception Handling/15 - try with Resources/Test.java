import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        // try with single resource
        try (FileWriter fw = new FileWriter("text.txt")) {
            fw.write("Hello, World!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
