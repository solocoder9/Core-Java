public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[10]);
    }
}

/* 
Runtime Exception:-
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Test1.main(Test1.java:4)


ArrayIndexOutOfBoundsException
------------------------------
- It is an exception in java that occurs when you try to access an index
 of an array that is outside the bound of the array.
- In other words, you're trying to access an element at an index that is
  either negetive or greater than or equal to the length of the array.

  Throwable
    ├── Exception
    │   └── RuntimeException
    │       └── IndexOutOfBoundsException
    │           └── ArrayIndexOutOfBoundsException
*/