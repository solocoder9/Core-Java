public class Test1 {
    static ArithmeticException e = new ArithmeticException();
    public static void main(String[] args) {
        throw e;
    }
}

/* 
Output:
Exception in thread "main" java.lang.ArithmeticException
        at Case1.<clinit>(Case1.java:2)

- Here e is a static variable that holds a reference to an ArithmeticException object, 
  so throwing e actually throws the ArithmeticException object that e refers to.
*/
