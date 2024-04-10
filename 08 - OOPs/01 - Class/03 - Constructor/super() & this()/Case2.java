

public class Case2 {
    
    // Constructor
    Case2() {
        super();
        this(); // Compile time Error
        System.out.print("Solo");

        /*
         * this() constructor call must be the 
         * first statement in a constructor
         */
    }
}
