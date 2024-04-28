public class Test2 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                System.out.println("Inner try block");
                System.out.println(100/0); // AE
            } catch (NullPointerException e) {
                System.out.println("Inner catch block");
            }
            System.out.println("After inner try-catch block");
        } catch (Exception e) {
            System.out.println("Outer catch block");
        } finally {
            System.out.println("Outer finally block");
        }
    }
}

/* 
Output:-
Outer try block
Inner try block
Outer catch block
Outer finally block
*/