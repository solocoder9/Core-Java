public class UserDefinedMethod {
    // User defined method to calculate sum of two numbers
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 9;
        // Call sum method
        int sumOfTwoNumbers = sum(a, b);
        System.out.println("Sum of a and b: " + sumOfTwoNumbers);
    } 
}
