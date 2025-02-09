import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        // Conversion of arrays to collection
        String[] s = { "aaa", "bbb", "ccc" };

        ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
        al.add("sss");
        al.add("ttt");
        System.out.println("String al data: " + al);

        System.out.println();

        // Conversion of generics collections to arrays
        String[] s1 = new String[al.size()];
        al.toArray(s1);
        System.out.println("String array data: ");
        for (String str : s1) {
            System.out.println(str);
        }

        System.out.println();

        // Conversion of normal collection to arrays
        ArrayList al2 = new ArrayList();
        al2.add("Dhoni");
        al2.add(45);
        al2.add("Virat");
        Object[] o = al2.toArray();
        System.out.println("Object array data");
        for (Object oo : o) {
            System.out.println(oo);
        }
    }
}
