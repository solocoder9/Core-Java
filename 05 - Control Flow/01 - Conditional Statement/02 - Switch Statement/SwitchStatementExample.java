public class SwitchStatementExample {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        String dayName;

        // Switch statement to find the day name
        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day: " + dayName);
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
