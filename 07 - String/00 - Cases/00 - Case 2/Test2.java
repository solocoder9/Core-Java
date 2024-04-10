public class Test2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Solo");
        StringBuffer sb2 = new StringBuffer("Solo");

        // '==' operator used for reference/address comparison
        System.out.println(sb1 == sb2); // false (because different object addresses)

        /*
         * Object class - equals() method is used for
         * reference/address comparison
         * StringBuffer class - equals() method (not overridden)
         * is used for same reference/address comparison (same as Object class)
         */
        System.out.println(sb1.equals(sb2)); // false (because different object addresses)
    }
}
