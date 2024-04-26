public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            return;
        } catch(Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
/* 
Output: 
try
finally

Even though a return statement is inside a try block, the finally block
will be executed first, and then the return statement will be considered.
*/
