public class Case6 {
    public static void main(String[] args) {

        // create a byte array containing ASCII values
        byte[] b = {97, 98, 99, 100};

        // Use the byte array to create a new String object
        String s = new String(b);

        // Print the new String object
        System.out.println(s); // Output: abcd
    }
}
