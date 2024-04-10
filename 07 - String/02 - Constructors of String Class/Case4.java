public class Case4 {
    public static void main(String[] args) {
        
        // StringBuilder object
        StringBuilder sb = new StringBuilder("Hello, World!");
        
        // Use the StringBuilder object to create a new String object
        String s = new String(sb);
        
        // Print the new String object
        System.out.println(s); // Output: Hello, World!
    }
}
