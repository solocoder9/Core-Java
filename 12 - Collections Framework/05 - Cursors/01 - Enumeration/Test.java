import java.util.Enumeration;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Dhoni");
        v.add("Rohit");
        v.add("Virat");
        v.add("Rutu");

        // Read the data using Enumeration: Non-generic version
        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            String s = (String) e.nextElement();
            System.out.println(s);
        }

        System.out.println();

        // Read the data using Enumeration: Generic version
        Enumeration<String> e1 = v.elements();
        while (e1.hasMoreElements()) {
            String s1 = e1.nextElement();
            System.out.println(s1);
        }
    }
}
