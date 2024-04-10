class GrandFather {

    // method
    void car() {
        System.out.println("Mustang GT 1969");
    }
}

class Father extends GrandFather {

    // method
    void superCar() {
        System.out.println("Toyota Supra MK4");
    }
}

class Son extends Father {
    
    // method 
    void superBike() {
        System.out.println("Kawasaki Ninja H2");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Son s1 = new Son();

        s1.superBike();
        s1.superCar();
        s1.car();
    }
}
