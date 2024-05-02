import java.util.Scanner;

class TooOldException extends RuntimeException {
    TooOldException(String msg) {
        super(msg);
    }
}

class TooYoungException extends RuntimeException {
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
Output:-
age: 80
Exception in thread "main" TooOldException: Your age is alredy crossed marriage age
        at Test1.main(Test1.java:24)

age: 15
Exception in thread "main" TooYoungException: Your age is below 18, Please wait some more time
        at Test1.main(Test1.java:26)

age: 25
Thanks for Registration
*/