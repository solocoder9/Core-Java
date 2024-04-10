public class Test2 {
    public static void main(String[] args) {

        // String object creation using a literal
        String s = "Solo";

        /*
         * When we create a String object using a literal,
         * the JVM first checks the String Constant Pool (SCP)
         * to see if the same object is already available.
         * If it is not available, a new object is created;
         * if it is available, the existing object is reused.
         */

        System.out.println(s);
    }
}
