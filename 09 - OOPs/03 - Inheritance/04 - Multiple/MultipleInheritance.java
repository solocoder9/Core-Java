// Interface for Animal
interface Animal {
    void eat();
    void sleep();
}

// Interface for Pet
interface Pet {
    void play();
}

// Dog class implementing both Animal and Pet interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        // Creating a Dog object
        Dog dog = new Dog();

        // Calling methods
        dog.eat();
        dog.sleep();
        dog.play();
    }
}

/**
 * This code demonstrates a form of multiple inheritance in Java using interfaces.
 * 
 * The `Dog` class implements both the `Animal` and `Pet` interfaces, which allows
 * it to inherit behaviors from both interfaces. This approach helps avoid the
 * diamond problem associated with multiple inheritance in class-based inheritance
 * models. Interfaces provide a way to achieve multiple inheritance by allowing
 * classes to implement multiple interfaces, thus inheriting behaviors from each
 * interface implemented.
 */
