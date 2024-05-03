public class Test {
    public static void recursiveMethod() {
        recursiveMethod();
    }

    public static void main(String[] args) {
        recursiveMethod();
    }
}

/* 
Runtime Error:-
Exception in thread "main" java.lang.StackOverflowError
        at Test.recursiveMethod(Test.java:3)


StackOverflowError
------------------
- It is an error in java that occurs when the stack memory if full.
- This typically happens when a method calls itself in an infinite 
  loop(Recursive Mthod), causing the stack to overflow.
- It is an unchecked error.
- Hierarchy:-

    Throwable
        └── Error
            └── StackOverflowError

*/