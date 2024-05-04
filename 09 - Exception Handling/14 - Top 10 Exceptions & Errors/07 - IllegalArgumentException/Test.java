public class Test {
    public static void main(String[] args) {

        Thread t = new Thread();
        t.setPriority(10);
        t.setPriority(100);
    }
}

/* 
Runtime Exception:-
Exception in thread "main" java.lang.IllegalArgumentException
        at java.lang.Thread.setPriority(Thread.java:1089)
        at Test.main(Test.java:6)


IllegalArgumentException
------------------------
- It is an exception in java that occurs when a method receives an argument
  that is illegal or inappropriate for the method.
- This typically occurs at the beginning of a method or function when validating 
  the parameters passed to it. If the method detects that one or more arguments 
  are invalid based on the method's requirements or constraints, it throws an 
  IllegalArgumentException to indicate the problem.
- Hierarchy:-

    Throwable
        └── Exception
                └── RuntimeException
                        └── IllegalArgumentException

*/