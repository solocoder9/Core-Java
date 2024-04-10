public class NarrowingTypeCasting {
    public static void main(String[] args) {
        // Narrowing (explicit) type casting
        double numDouble = 3.14;
        float numFloat = (float) numDouble; // double to float

        long numLong = 123456789L;
        int numInt = (int) numLong; // long to int

        System.out.println("numDouble as float: " + numFloat);
        System.out.println("numLong as int: " + numInt);
    }
}

/*
- Narrowing, or explicit, type casting in Java occurs when a value of a larger data type
  is explicitly converted to a smaller data type.
- It is also known as downcasting because the value is casted to a "lower" data type.
- Narrowing type casting is done when there is a possibility of losing data or precision,
  and the programmer explicitly indicates that the conversion is intended.
- For example, when a double value is assigned to a float variable, or when a long value
  is assigned to an int variable.
- Java requires explicit casting for narrowing type conversions to avoid potential loss
  of data or precision.
- Narrowing type casting is also known as narrowing conversion.
*/
