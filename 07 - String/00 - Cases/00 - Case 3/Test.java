public class Test {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();

        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // true
    }
}
