class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

public class Case1 {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.makeSound(); // Some sound

        Dog d = new Dog();
        d.makeSound(); // Woof

        Animal a1 = new Dog();
        a1.makeSound(); // Woof
        
        /*
         * Animal a1 = new Dog(); 
         * Here, a1 reference is Animal type so at compile time
         * compiler call the Super class method, But at run time 
         * JVM will call sub class method because here run time
         * object is Dog. 
         * Basically, method Overriding is based one the run time
         * type object, not the rerenence type.
         */
    }
}
