class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.makeSound();       // Calls method from Animal class
        
        Dog dog = (Dog) animal;   // Downcasting
        dog.bark();              // Calls method from Dog class
    }
}

