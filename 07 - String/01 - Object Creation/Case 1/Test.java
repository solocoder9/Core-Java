public class Test {
    public static void main(String[] args) {

        // String object creation using the new Keyword
        String s = new String("Solo");

        /*
         * When we create a String object using the `new` keyword,
         * two objects are created: one in the Heap area and another in
         * the String Constant Pool (SCP) for future reference.
         */

        System.out.print(s);
    }
}
