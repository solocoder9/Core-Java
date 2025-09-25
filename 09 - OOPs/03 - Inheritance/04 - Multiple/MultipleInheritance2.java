// Interface for Animal
interface Animal {
    void eat();
}

// Interface for Pet
interface Pet {
    void eat();
}

// Dog class implementing both Animal and Pet interfaces
class Dog implements Animal, Pet {
    // Implementation of the eat method from Animal interface
    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class MultipleInheritance2 {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog dog = new Dog();

        // Calling the eat method from the Animal interface
        dog.eat();
    }
}

/**
 * This code demonstrates how interfaces can be used to avoid the diamond problem
 * in multiple inheritance in Java.
 * 
 * Both the `Animal` and `Pet` interfaces have a method named `eat()`, and the `Dog`
 * class implements both interfaces. However, since interfaces only provide method
 * declarations and not implementations, there is no conflict in the `Dog` class
 * implementing both interfaces. This way, Java avoids the diamond problem by
 * allowing classes to implement multiple interfaces with the same method signatures.
 */
