import java.util.Scanner;

class TooOldException extends Exception  {
    TooOldException(String msg) {
        super(msg);
    }
}

class TooYoungException extends Exception {
    TooYoungException(String msg) {
        super(msg);
    }
}
public class Test1 {
    public static void main(String[] args) {

        System.out.println("Welcome to Indian Matrimony\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = sc.nextInt();

        if (age > 60) {
            throw new TooOldException("Your age is alredy crossed marriage age");
        } else if (age < 18) {
            throw new TooYoungException("Your age is below 18, Please wait some more time");
        } else {
            System.out.println("Thanks for Registration");
        }
    }
}

/* 
Compile-time Error:-
Test1.java:24: error: unreported exception TooOldException; must be caught or declared to be thrown
            throw new TooOldException("Your age is alredy crossed marriage age");
            ^
Test1.java:26: error: unreported exception TooYoungException; must be caught or declared to be thrown
            throw new TooYoungException("Your age is below 18, Please wait some more time");

- In this code, TooOldException and TooYoungException are checked exceptions because they extend Exception,
  which is a checked exception class.
*/