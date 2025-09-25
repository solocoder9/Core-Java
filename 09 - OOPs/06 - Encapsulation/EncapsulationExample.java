// Bean class representing a Person
class Person {
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person();

        // Setting values using setter methods
        person.setName("Solo");
        person.setAge(24);

        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

/**
 * This code demonstrates encapsulation using a simple bean class in Java.
 * 
 * The `Person` class has private fields `name` and `age`, and public getter and setter
 * methods to access and modify these fields. Getter methods (`getName()` and `getAge()`)
 * are used to retrieve the values of the private fields, while setter methods (`setName()`
 * and `setAge()`) are used to set the values of the private fields. This ensures that the
 * internal state of the `Person` object is encapsulated, and access to its fields is
 * controlled through these methods, allowing for better control over the object's state
 * and behavior.
 */

