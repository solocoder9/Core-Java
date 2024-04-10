public class Case3 {
    public static void main(String[] args) {
        String s = new String("Solo");
        // Two objects created: one in the heap and another in the SCP

        // Concatenating "Suv" to 's' and assigning the result back to 's'
        s.concat("Suv"); // SoloSuv (Garbage collection)

        // Concatenating "AsAlways" to 's' and assigning the result back to 's'
        s = s.concat("AsAlways");
        System.out.println(s); // Output: SoloSuvAsAlways
    } 
}
