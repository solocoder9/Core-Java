public class Method2 {
    
    // Method to calculate sum of two number
    static int sum(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {
        int m = 15;
        int n = sum(2, 5);
        System.out.println("m : " + m);
        System.out.println("n : " + n);

        // Math.max() is a pre-defined method used to find the maximum between two numbers
        int max = Math.max(m, n);
        System.out.println("Maximum : " + max);
    }
}
