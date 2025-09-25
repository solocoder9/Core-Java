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

// Cat class implementing Animal interface
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

// AnimalPlay class extending Cat and implementing Pet interface
class AnimalPlay extends Cat implements Pet {
    public void play() {
        System.out.println("Cat is playing");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        // Creating objects
        Dog dog = new Dog();
        Cat cat = new Cat();
        AnimalPlay animalPlay = new AnimalPlay();

        // Calling methods
        dog.eat();
        dog.sleep();
        dog.play();

        cat.eat();
        cat.sleep();

        animalPlay.eat();
        animalPlay.sleep();
        animalPlay.play();
    }
}

/**
 * This code demonstrates a form of hybrid inheritance in Java using interfaces.
 * 
 * The `Dog` class implements both the `Animal` and `Pet` interfaces, which allows
 * it to inherit behaviors from both interfaces. The `Cat` class implements only the
 * `Animal` interface, and the `AnimalPlay` class extends `Cat` and implements the `Pet`
 * interface. This demonstrates a combination of multiple inheritance (through interfaces)
 * and hierarchical inheritance, showing how different classes can inherit behaviors from
 * multiple interfaces and a superclass.
 */
