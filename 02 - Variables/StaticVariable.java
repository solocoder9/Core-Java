public class StaticVariable {
    // Declare a static variable
    public static int count; // Static variable to count instances

    public StaticVariable() {
        count++; // Increment the static variable in the constructor
    }

    public static void main(String[] args) {
        // Create objects of the StaticVariable class
        new StaticVariable();
        new StaticVariable();
        new StaticVariable();

        // Print the value of the static variable
        System.out.println("Number of instances created: " + StaticVariable.count); // Output: Number of instances created: 3
    }
}

/*
A static variable in Java is a variable that belongs to the class rather than to any instance of the class. 
It is shared among all instances of the class. 
In this example, the count variable is a static variable of the StaticVariable class. 
It is used to count the number of instances created.
*/
