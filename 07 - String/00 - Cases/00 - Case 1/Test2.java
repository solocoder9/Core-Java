public class Test2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, ");
        // The append method is used to add more content
        // to the existing character sequence (StringBuffer)
        sb.append("World!");
        System.out.println(sb); // Hello, World! (Mutable)
    }
}
