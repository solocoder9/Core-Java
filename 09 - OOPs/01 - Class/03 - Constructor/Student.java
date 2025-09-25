public class Student {
    String name;
    int rollNumber;

    // Constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {

        // Object creation and Initialization
        Student s1 = new Student("Suv", 354);
        
        System.out.println("Name : " + s1.name);
        System.out.println("Roll Number : " + s1.rollNumber);
    }
}
