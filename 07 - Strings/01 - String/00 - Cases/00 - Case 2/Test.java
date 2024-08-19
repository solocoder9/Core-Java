public class Test {
    public static void main(String[] args) {
        String s1 = new String("Solo");
        String s2 = new String("Solo");

        // '==' operator used for reference/address comparison
        System.out.println(s1 == s2); // false (because different object addresses)

        /*
         * Object class - equals() method is used for
         * reference/address comparison
         * String class - equals() method (Overridden of Object class equals())
         * is used for content comparison
         */
        System.out.println(s1.equals(s2)); // true (because contents are the same)
    }
}
