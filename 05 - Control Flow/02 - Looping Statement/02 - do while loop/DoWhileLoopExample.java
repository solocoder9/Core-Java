public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Count is: " + i);
            i++;
        } while (i <= 5);
    }
}

/*
- The do-while loop is similar to the while loop, but the condition is checked after the loop body is executed.
- This means that the body of the loop is guaranteed to execute at least once, even if the condition is false initially.
- In this example, the loop will print the value of i from 1 to 5, because the condition i <= 5 is checked after the first iteration.
*/
