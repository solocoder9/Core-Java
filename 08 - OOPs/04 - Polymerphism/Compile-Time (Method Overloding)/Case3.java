public class Case3 {
    
    public void m1(String s) {
        System.out.println("String version");
    }

    public void m1(StringBuilder sb) {
        System.out.println("StringBuilder version");
    }

    public static void main(String[] args) {
        
        Case3 c3 = new Case3();
        c3.m1("Suv"); // String version
        c3.m1(new StringBuilder("Suv")); // StringBuilder version
        c3.m1(null); // Compiler Time error(Ambiguty Error)
        /*
         * In the above method call, null value is suitable for
         * both method. 
         * If there are multiple methods in a class with the same 
         * signature that make it unclear to compiler which method
         * should be called, it is known as abmiguty error.
         */
    }
}
