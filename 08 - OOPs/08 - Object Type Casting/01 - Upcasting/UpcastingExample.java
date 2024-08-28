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

public class UpcastingExample {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Create a Dog object
        Animal animal = dog; // Upcasting: Dog to Animal (implicit)
        
        animal.makeSound(); // Calls method from Animal class
        // animal.bark(); // This line would cause a compile-time error because `bark` is not a method in Animal
    }
}
