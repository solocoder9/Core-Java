public class Case2 {
    public static void main(String[] args) {

        // Object creation using the new keyword
        String s1 = new String("Solo");
        // Two objects created: one in the heap and another in the SCP

        String s2 = new String("Solo");
        // One object created in the heap and 
        // in the SCP, the same object is already available so 
        // JVM will reuse that

        String s3 = "Solo";
        // No object created because the same object is already
        // available in the SCP, so it is reused

        String s4 = "Solo";
        // No object created because the same object is already
        // available in the SCP, so it is reused

        /*
         * So, in total, 3 objects are created: two objects
         * in the heap and 1 object in the String Constant Pool(SCP)
         */

        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

    }
}
