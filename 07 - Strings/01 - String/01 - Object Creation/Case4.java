public class Case4 {
    public static void main(String[] args) {
        String s1 = new String("MS");
        s1.concat("Dhoni"); // MSDhone (Garbage Collection)

        String s2 = s1.concat("Rohit"); // MSRohit
        s2.concat("Sharma"); // MSRohitSharme(Garbage collection)

        System.out.println(s1); //MS
        System.out.println(s2); //MSRohit
    }
}
