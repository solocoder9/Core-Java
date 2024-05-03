public class Test2 {
    public static void main(String[] args) {
        Object obj = new Object();
        String str = (String) obj;
        System.out.println(str);
    }
}

/* 
Runtime Exception:-
Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
        at Test.main(Test2.java:4)


- The exception in this code occurs because you are trying to downcast an Object to a String, which is not 
  allowed in Java. 
- Since Object is a superclass of String, you can only upcast String to Object, not the other way around.
*/