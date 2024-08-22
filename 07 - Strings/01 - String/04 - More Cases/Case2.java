public class Case2 {
    public static void main(String[] args) {
        String s1 = "dhoni";
        String s2 = s1.toString();
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false
    }
}

/*
 * Explanation:
 *
 * 1. String s1 = "dhoni";
 *    - s1 refers to the "dhoni" string from the String Constant Pool (SCP).
 *
 * 2. String s2 = s1.toString();
 *    - Returns the same reference as s1 because s1 is already a String object.
 *
 * 3. String s3 = s1.toLowerCase();
 *    - Returns the same reference as s1 if s1 is already in lowercase ("dhoni").
 *
 * 4. String s4 = s1.toUpperCase();
 *    - Creates a new String object with value "DHONI", which is different from s1.
 *
 * 5. s1 == s2 evaluates to true because both s1 and s2 refer to the same SCP object.
 * 6. s1 == s3 evaluates to true because s1 is already in lowercase, so s3 refers to the same object.
 * 7. s1 == s4 evaluates to false because s4 is a new object with uppercase value.
 */
