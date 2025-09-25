import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Dhoni");
        al.add("Shivam");
        al.add("Rutu");
        al.add("Rohit");
        al.add("Virat");

        // Before sorting
        System.out.println("Before sorting: " + al);
        Collections.sort(al);  // Sort the ArrayList
        System.out.println("After sorting: " + al);

        System.out.println("===========================");

        // Sorting Wrapper class objects
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(50);
        ll.add(30);
        ll.add(80);
        System.out.println("Before sorting: " + ll);
        Collections.sort(ll);  // Sort the LinkedList
        System.out.println("After sorting: " + ll);
    }
}

/*
 * Note:
 * - Sorting a list with heterogeneous data types will throw a ClassCastException.
 * - Sorting a list that contains null values will throw a NullPointerException.
 */
