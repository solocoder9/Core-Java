import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(9);
        al1.add(15);

        // Approach 1: add collection by using constructor
        ArrayList<Integer> al2 = new ArrayList<Integer>(al1);
        al2.add(99);
        System.out.println("al2: " + al2);

        // Approach 2: add collection by using addAll() method
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3.add(999);
        al3.addAll(al2);
        System.out.println("al3: " + al3);

    }
}
