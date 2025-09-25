import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Dhoni");
        a1.add("Rohit");
        a1.add("Virat");
        a1.add("Rutu");

        // Read the data using Iterator: Non-generic version
        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s);
        }

        System.out.println("=========================================");

        // Read the data using Iterator: Generic version
        Iterator<String> itr1 = a1.iterator();
        while (itr1.hasNext()) {
            String s = itr1.next();
            System.out.println(s);
        }
    }
}
