public class Test3 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.exit(-10); 
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

When System.exit(-10) is called in the try block, the program is forcefully terminated
with an exit code of -10, and the finally block is not executed.
*/
