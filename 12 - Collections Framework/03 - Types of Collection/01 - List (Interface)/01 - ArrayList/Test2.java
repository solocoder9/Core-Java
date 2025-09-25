import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        // Creating an ArrayList l1
        ArrayList l1 = new ArrayList();
        l1.add("Apple");
        l1.add("Orange");
        l1.add("Banana");
        System.out.println("l1: " + l1);

        // Creating an ArrayList and adding the elements of l1
        ArrayList l2 = new ArrayList(l1);
        System.out.println("l2: " + l2);

        // Creating another ArrayList l3
        ArrayList l3 = new ArrayList();
        l3.add("Mango");
        l3.add("Guava");
        System.out.println("l3: " + l3);

        // Creating an ArrayList and adding the elements of l1 and l3
        ArrayList l4 = new ArrayList();
        l4.addAll(l1); // adding all elements of l1
        l4.addAll(l3); // adding all elements of l3
        System.out.println("l4: " + l4);
    }
}

/**
 * add() : method is used to add a single element to the list.
 * addAll() : method is used to add all elements from a specified collection to
 * the list.
 */
