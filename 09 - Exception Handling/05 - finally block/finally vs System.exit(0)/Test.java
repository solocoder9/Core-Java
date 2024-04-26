public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.exit(0); // Forcefully terminate the program
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}

/* 
Output: 
try

There is only one situation where the finally block will not
execute, and that is when there is a System.exit(0) call in the try block.
The System.exit(0) method is used to forcefully terminate the program with
an exit code of 0.
*/
