public class TernaryOperatorExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        // Ternary Operator (condition ? expression1 : expression2)
        int result = (x > y) ? x : y; // If x is greater than y, result is x, otherwise result is y

        System.out.println("Result: " + result);
    }
}

/*
- The ternary operator (also known as the conditional operator) is used as a shortcut for the if-else statement.
- It has three operands: a condition, an expression to evaluate if the condition is true, and an expression to evaluate if the condition is false.
- If the condition is true, the first expression is evaluated and becomes the result. If the condition is false, the second expression is evaluated and becomes the result.
- The ternary operator is often used to assign a value to a variable based on a condition in a concise way.
*/
