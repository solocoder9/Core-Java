public class Test2 {
    static ArithmeticException e; 
    public static void main(String[] args) {
        throw e; 
    }
}

/* 
Output:
Exception in thread "main" java.lang.NullPointerException
        at Test2.main(Test2.java:4)

- Here e is a static object reference variable, so for a static 
  variable, the JVM provides the default value, which is null 
  because it's an object type.
- So, if we try to throw the null reference using the throw 
  keyword, we will get a NullPointerException.
*/
