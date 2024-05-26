import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList al = new ArrayList();
        al.add("S");
        al.add(9); // Auto-boxing
        al.add("S");
        al.add(null);
        al.add(3.5);

        // System.out.println(al.toString());
        System.out.println(al);

        al.remove(2);
        System.out.println(al);
        al.add(1, "15");
        al.add("Solo");

        System.out.println(al);
    }
}