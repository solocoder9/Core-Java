public class Test1 {
    public static void main(String[] args) {
        throw new Test();
    }
}

/* 
Compilation Error:-
incompatible types: Test cannot be converted to Throwable

- We can use the throw keyword only for objects that are instances of a class that
  extends Throwable (either directly or indirectly), not for normal class types.
*/
