public class Test {
    public static void main(String[] args) {
        int i = Integer.parseInt("10");
        int i = Integer. parseInt("ten");
    }
}

/* 
Runtime Exception:-
Exception in thread "main" java.lang.NumberFormatException: For input string: "ten"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Test.main(Test.java:4)


NumberFormatException
---------------------
- It is an exception in Java that occurs when a method attempts to convert a string to one of the 
  numeric types, but the string is not a valid representation of a number. This typically happens 
  when using methods like parseInt() or valueOf() in the Integer, Double, or other wrapper classes.
- Hierarchy:-

    Throwable
        └── Exception
            └── RuntimeException
                └── IllegalArgumentException
                    └── NumberFormatException

*/