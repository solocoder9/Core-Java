class Case1 {
    public static void main(String[] args) {
        try {
            System.out.println("try");
        } catch(Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }
}
/* 
If there is no exception, the finally block will be executed.
*/
