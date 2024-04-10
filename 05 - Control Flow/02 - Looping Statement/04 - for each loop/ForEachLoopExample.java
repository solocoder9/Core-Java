public class ForEachLoopExample {
    public static void main(String[] args) {
        // Using a for-each loop to iterate over an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}

/*
- The for-each loop in Java provides a concise way to iterate over arrays and collections.
- It is especially useful when you want to iterate over all elements of an array or collection without using an index variable.
- In this example, the for-each loop iterates over each element in the 'numbers' array and assigns it to the variable 'num'.
- The loop body then prints each 'num' to the console.
*/
