import java.util.ArrayList;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Dhoni");
        a1.add("Rohit");
        a1.add("Virat");
        a1.add("Rutu");

        // Read data using ListIterator: non-generic version
        ListIterator l = a1.listIterator();

        while (l.hasNext()) {
            String s = (String) l.next();
            System.out.println(s);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (l.hasPrevious()) {
            String s = (String) l.previous();
            System.out.println(s);
        }

        System.out.println("===================================");

        // Read data using ListIterator: generic version
        ListIterator<String> l2 = a1.listIterator();

        while (l2.hasNext()) {
            String s = l2.next();
            System.out.println(s);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        while (l2.hasPrevious()) {
            String s = l2.previous();
            System.out.println(s);
        }
    }
}

/* 
Note: We cannot print directly in the backward direction because the cursor starts at the beginning of the list.
We must first traverse forward to move the cursor to the end, allowing us to then traverse backward.
*/
