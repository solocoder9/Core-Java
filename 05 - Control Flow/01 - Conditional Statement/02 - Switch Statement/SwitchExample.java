public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 4;

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Sunday!");
                break;
            case 2:
                System.out.println("It's Monday!");
                break;
            case 3:
                System.out.println("It's Tuesday!");
                break;
            case 4:
                System.out.println("It's Wednesday!");
                break;
            case 5:
                System.out.println("It's Thursday!");
                break;
            case 6:
                System.out.println("It's Friday!");
                break;
            case 7:
                System.out.println("It's Saturday!");
                break;
            default:
                System.out.println("Invalid day of the week.");
                break;
        }
    }
}

/*
- A switch statement allows you to test a variable against a list of values and execute different blocks of code based on the value of the variable.
- The switch statement evaluates the expression (dayOfWeek in this example) and compares it with each case value.
- If a case value matches the expression, the corresponding block of code is executed.
- The break statement is used to exit the switch statement after a match is found to prevent fall-through to the next case.
- The default case is executed if none of the case values match the expression.
- In this example, the switch statement finds the day name based on the day of the week (1 to 7).
*/

