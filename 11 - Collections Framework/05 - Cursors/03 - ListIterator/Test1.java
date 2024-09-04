import java.util.ArrayList;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Dhoni");
        a1.add("Rutu");
        a1.add("Rohit");
        
        // Before any operation
        System.out.println(a1);
        
        ListIterator<String> l1 = a1.listIterator();
        l1.add("Sivam");  // Add "Sivam" before the first element
        
        while (l1.hasNext()) {
            String s = l1.next();
            if (s.equals("Rohit")) {
                l1.remove();  // Remove "Rohit"
            }
            if (s.equals("Rutu")) {
                l1.set("Raina");  // Replace "Rutu" with "Raina"
            }
        }
        
        // After operations
        for (String s : a1) {
            System.out.println(s);
        }
    }
}
