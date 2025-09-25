import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader object to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read a line of text from the console
        System.out.print("Enter some text: ");
        String input = reader.readLine();
        System.out.println("You entered: " + input);

        // Close the BufferedReader
        reader.close();
    }
}

/*
- BufferedReader is a class in Java that reads text from a character-input stream,
  buffering characters to provide efficient reading of characters, arrays, and lines.
- It is used to read text from a source such as a file or the console.
- BufferedReader is often used with InputStreamReader to read input from the console
  or with FileReader to read from a file.
- It provides methods like readLine(), read(), and close() for reading and closing the stream.
- BufferedReader is efficient for reading large amounts of text because it buffers the input,
  reducing the number of reads from the underlying stream.
- It is recommended to close the BufferedReader using the close() method when it is no longer needed
  to free up system resources.
*/
