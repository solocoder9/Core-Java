import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Solo");
        l.add(9);
        l.add(null);
        System.out.println(l);
        l.set(2, "Coder");
        System.out.println(l);
        l.add(0, "Hi");
        System.out.println(l);
        l.removeLast();
        l.addFirst("Hello");
        System.out.println(l);
    }
}
