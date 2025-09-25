public class Test2 {
    
    public static int m1() {
        try {
            return 777;
        } catch (Exception e) {
            return 888;
        } finally {
            return 999;
        }
    }

    public static void main(String[] args) {
        System.out.println(m1());
    }
}

/* 
Output: 999

If a return statement is present in the try, catch, and finally blocks,
the return statement in the finally block will be considered.
*/
