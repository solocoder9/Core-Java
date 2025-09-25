import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the console
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // Read a double from the console
        System.out.print("Enter a double: ");
        double dnum = scanner.nextDouble();
        System.out.println("You entered: " + dnum);

        // Read a line of text from the console
        System.out.print("Enter some text: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);

        // Close the Scanner
        scanner.close();
    }
}

/*
- Scanner is a class in Java that provides methods for parsing primitive data types and strings
  from a source such as a file or the console.
- It is used to read input from the keyboard or from a file in a simple and convenient way.
- Scanner provides methods like nextInt(), nextDouble(), nextLine(), etc., for reading different types of input.
- It uses whitespace as the default delimiter to separate tokens, but the delimiter can be changed using the useDelimiter() method.
- Scanner is easy to use and is suitable for interactive console programs and small data processing tasks.
- It is recommended to close the Scanner using the close() method when it is no longer needed
  to free up system resources.
*/
