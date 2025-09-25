class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = (Dog) animal; // ClassCastException occurs here
        dog.bark();
    }
}

/* 
Runtime Exception:-
Exception in thread "main" java.lang.ClassCastException: Animal cannot be cast to Dog
        at Test.main(Test.java:16)


ClassCastException
------------------
- in Java occurs when you try to cast an object to a type that is not compatible with 
  its actual type. 
- This typically happens when you try to cast an object of a class to a subclass of 
  that class, or when casting between incompatible types in the class hierarchy.
- Hierarchy:-

    Throwable
        └── Exception
                └── RuntimeException
                        └── ClassCastException

*/