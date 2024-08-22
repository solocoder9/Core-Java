public class Case1 {
    public static void main(String[] args) {
        String s1 = new String("dhoni");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();

        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // true
    }
}

/*
 * Explanation:
 *
 * 1. String s1 = new String("dhoni");
 *    - Creates a new String object in the heap.
 *
 * 2. String s2 = s1.toUpperCase();
 *    - Creates a new String object with value "DHONI".
 *
 * 3. String s3 = s1.toLowerCase();
 *    - Returns the same object as s1 if already lowercase.
 *
 * 4. s1 == s2 evaluates to false because s1 and s2 are different objects.
 * 5. s1 == s3 evaluates to true if s3 reuses s1 (same object reference).
 */
