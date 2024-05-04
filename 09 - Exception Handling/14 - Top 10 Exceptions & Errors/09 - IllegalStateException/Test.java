import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        System.out.println(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            //Object obj = itr.next();
            itr.remove();
        }
        System.out.println(list);
    }
}

/* 
Runtime Exception:-
[apple, banana, orange]
Exception in thread "main" java.lang.IllegalStateException
        at java.util.ArrayList$Itr.remove(ArrayList.java:872)
        at Test.main(Test.java:15)


IllegalStateException
---------------------
- It is an exception in java that occurs when a method is called at 
  an inappropriate time or in an inappropriate state.
- It is typically thrown when a method is invoked that is not allowed 
  in the current state of the object.
- Heirarchy:-

    Throwable
    └── Exception
        └── RuntimeException
            └── IllegalStateException

*/