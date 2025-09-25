public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.exit(1000); // Forcefully terminate the program with exit code 1000
        } catch (Exception e) {
            System.out.println("catch"); // This block is skipped due to System.exit(1000)
        } finally {
            System.out.println("finally"); // This block is not executed
        }
    }
}

/* 
Output: 
try

When System.exit(1000) is called in the try block, the program is forcefully terminated
with an exit code of 1000, and the finally block is not executed.
*/
