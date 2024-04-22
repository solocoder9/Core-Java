public class WithoutTryCatch {
    public static void main(String[] args) {
        
        System.out.println("Start");
        System.out.println(100/0); // AE
        System.out.println("End");
    }
}

/*
Start
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at WithoutTryCatch.main(WithoutTryCatch.java:5)

        (abnormal termination)
 */