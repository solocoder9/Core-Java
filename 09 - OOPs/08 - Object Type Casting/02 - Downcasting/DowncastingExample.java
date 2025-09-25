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

public class DowncastingExample {
	public static void main(String[] args) {
		Animal animal = new Dog(); // Upcasting: Dog to Animal (implicit)

		if (animal instanceof Dog) { // Check if animal is actually an instance of Dog
			Dog dog = (Dog) animal; // Downcasting: Animal to Dog (explicit)
			dog.bark(); // Safe to call Dog-specific method
		} else {
			System.out.println("The object is not an instance of Dog");
		}
	}
}
