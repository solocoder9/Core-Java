public class InstanceVariable {
    // Declare an instance variable
    private int number; // Instance variable for storing a number

    // Constructor to initialize the instance variable
    public InstanceVariable(int number) {
        this.number = number; // Initialize the instance variable with the given number
    }

    // Method to get the value of the instance variable
    public int getNumber() {
        return number; // Return the value of the instance variable
    }

    public static void main(String[] args) {
        // Create an object of the MyClass class with the number 42
        InstanceVariable obj = new InstanceVariable(42);

        // Print the value of the instance variable
        System.out.println("The number is: " + obj.getNumber()); // Output: The number is: 42
    }
}

/*
An instance variable in Java is a variable that is declared inside a class but outside any method, 
constructor, or block. 
Each object of the class has its own copy of the instance variable. 
In this example, the variable number is an instance variable of the MyClass class. 
It is initialized using a constructor and accessed using a getter method.
*/
