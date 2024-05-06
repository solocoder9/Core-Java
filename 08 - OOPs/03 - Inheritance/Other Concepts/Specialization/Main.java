// General superclass
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Specialized subclass
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

// Specialized subclass
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Specific to Dog

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}
