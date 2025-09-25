import java.io.FileReader;
import java.io.PrintWriter;

public class Test2 {
    public static void main(String[] args) {
        // try with mutilple resources
        try (FileReader fr = new FileReader("input.txt");
             PrintWriter pw = new PrintWriter("output.txt")) {
            
            int c;
            while ((c = fr.read()) != -1) {
                pw.print((char) c);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
    }
}
