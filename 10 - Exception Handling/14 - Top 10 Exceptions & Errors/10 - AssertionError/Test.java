public class Test {
    public static void main(String[] args) {
      int age = 15;
      assert age >= 18; // Simple assertion
    }
  }
  
/* 
Run by using 'java -ea Test' -ea is using to enable assertion
Runtime Exception:-
Exception in thread "main" java.lang.AssertionError
        at Test.main(Test.java:4)


AssertionError
--------------
- It is an error in Java occurs when an assertion made by the assert 
  statement in a Java program fails. 
- Hierarchy:-

  Throwable
    └── Error
          └── AssertionError

*/