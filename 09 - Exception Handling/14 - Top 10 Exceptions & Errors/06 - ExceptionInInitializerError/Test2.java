public class Test2 {
    static {
        String s = null;
        System.out.println(s.length());
    }
    public static void main(String[] args) {

    }
}

/* 
Runtime Error:-
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.NullPointerException
        at Test.<clinit>(Test2.java:4)
*/