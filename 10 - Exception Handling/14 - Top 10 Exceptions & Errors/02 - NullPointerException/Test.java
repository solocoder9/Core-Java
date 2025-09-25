public class Test {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // NullPointerException
    }
}

/*
Runtime Exception:-
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:4)


NullPointerException
-------------------
- It is an exception in java that occures whenn you try to acdess or call
  a method on an object reference that is not initialized(i.e. 'null').
- This means that the object does not exist in memory, but you're trying 
  to use it as if it does.
- Hierarchy:-

    Throwable
        └── Exception
              └── RuntimeException
                    └── NullPointerException

 */