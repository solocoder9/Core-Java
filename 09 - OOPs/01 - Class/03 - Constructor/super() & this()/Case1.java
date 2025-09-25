public class Case1 {
    // Constructor
    Case1() {
        System.out.println("Solo");
        super(); // Compile Time error

        /*
         * Super() constructor call must be the first
         * statement in a Constructor
         */
    }
}
