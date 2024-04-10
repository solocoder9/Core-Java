public class Case2 {
    
    public void m1(Object o) {
        System.out.println("Object version");
    }

    public void m1(String s) {
        System.out.println("Sting version");
    }

    public static void main(String[] args) {
        
        Case2 c2 = new Case2();
        c2.m1(new Object()); // Object version
        c2.m1("Suv"); // String version
        c2.m1(null); // String version 
        /* 
         * In the above method call, null argument is 
         * applicable for both method.
         * If super and sub both methods got matched
         * then always priority will goes to sub method. 
         * Object(super) --> String(sub)
         */
    }
}
