class Father {

    // method
    void car() {
        System.out.println("Supra MK4");
    }
}

class Son extends Father {

    // method
    void bike() {
        System.out.println("Ninja H2");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        // Create object of Son class
        Son s1 = new Son();
        s1.bike();
        s1.car();
    }
}
