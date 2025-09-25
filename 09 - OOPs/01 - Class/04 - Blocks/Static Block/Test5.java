public class Test5 {

    // Static variable
    static int favNumber;

    // Initialize the static voarible using static block
    static {
        favNumber = 9;
    }

    static void disp() {
        System.out.println(Test5.favNumber);
    }
    public static void main(String[] args) { 
        Test5.disp();
    }
}

/*
 * Static blocks are used to initialize the static variables
 * during class loading
 */