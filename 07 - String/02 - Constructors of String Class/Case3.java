public class Case3 {
    public static void main(String[] args) {
        
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello, World!");
        
        // Use the StringBuffer object to create a new String object
        String s = new String(sb);
        
        // Print the new String object
        System.out.println(s); // Output: Hello, 
    }
}
