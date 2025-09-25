// General superclass
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Specialized subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

// Specialized subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();        // Inherited from Animal
        dog.makeSound();  // Specific to Dog

        Animal cat = new Cat();
        cat.eat();        // Inherited from Animal
        cat.makeSound();  // Specific to Cat
    }
}
