import java.util.ArrayList;
import java.util.Iterator;

public class RemoveData {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Dhoni");
        a1.add("Rohit");
        a1.add("Virat");
        a1.add("Rutu");

        // Before removing data
        System.out.println(a1);

        Iterator<String> itr = a1.iterator();

        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("Virat")) {
                itr.remove();
            }
        }

        // After removing data
        System.out.println(a1);
    }
}
