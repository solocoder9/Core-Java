public class Case5 {
    public static void main(String[] args) {

        String s1 = new String("MS Dhoni");
        String s2 = new String("MS Dhoni");
        System.out.println(s1 == s2); // false (different ref)

        String s3 = "MS Dhoni";
        System.out.println(s1 == s3); // false (different ref)

        String s4 = "MS Dhoni";
        System.out.println(s3 == s4); // true (same ref)

        String s5 = "MS " + "Dhoni";
        // Concatenation is done at compile time since both parts are constants,
        // so JVM will check in SCP and reuse the existing "MS Dhoni" object
        System.out.println(s4 == s5); // true (same ref)

        String s6 = "MS ";
        String s7 = s6 + "Dhoni";
        // Concatenation is done at runtime because s6 is a normal variable,
        // so a new object is created in the heap for "MS Dhoni"
        System.out.println(s4 == s7); // false (different ref)

        final String s8 = "MS ";
        String s9 = s8 + "Dhoni";
        // Concatenation is done at compile time because s8 is final,
        // so JVM will check in SCP and reuse the existing "MS Dhoni" object
        System.out.println(s4 == s9); // true (same ref)
    }
}
