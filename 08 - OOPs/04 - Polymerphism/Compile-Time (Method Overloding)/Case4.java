class Animal {

}

class Monkey extends Animal {

}

public class Case4 {
    
    public void m1(Animal a) {
        System.out.println("Animal version");
    }

    public void m1(Monkey m) {
        System.out.println("Monkey version");
    }

    public static void main(String[] args) {

        Case4 c4 = new Case4();

        Animal a = new Animal();
        c4.m1(a); // Animal version

        Monkey m = new Monkey();
        c4.m1(m); // Monkey version

        Animal a1 = new Monkey();
        c4.m1(a1); // Animal version

        /*
         * Animal a1 = new Monkey();
         * Here a1 reference is Animal type and Monkey is the 
         * run time ojbect.
         * In method overloding, method resolution always takes care
         * by compiler based on reference type. Run type object never
         * goto play any role.
         * 
         * Method Resolution: is the process by which the java compiler
         * selects the most appropriate method among several overloaded 
         * methods with the same name based on the arguments passed.
         */
    }
}
