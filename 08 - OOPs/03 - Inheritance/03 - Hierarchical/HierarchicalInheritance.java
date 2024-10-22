class Father {

    void car() {
        System.out.println("Dodge Challenger");
    }
}

class Son extends Father {

    void bike() {
        System.out.println("Kawasaki Z900");
    }
}

class Daughter extends Father {

    void scooter() {
        System.out.println("Piaggio Vespa");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        // Creating Son class object
        Son s1 = new Son();
        s1.bike();
        s1.car();

        // Creating Daughter class object
        Daughter d1 = new Daughter();
        d1.scooter();
        d1.car();
    }
}
