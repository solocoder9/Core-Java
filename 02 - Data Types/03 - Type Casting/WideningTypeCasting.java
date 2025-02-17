public class WideningTypeCasting {
    public static void main(String[] args) {
        // Widening (implicit) type casting
        byte numByte = 10;
        short numShort = numByte; // byte to short

        char charA = 'A';
        int numInt = charA; // char to int

        System.out.println("numByte as short: " + numShort);
        System.out.println("charA as int: " + numInt);
    }
}

/*
- Widening, or implicit, type casting in Java occurs when a value of a smaller data type
  is automatically converted to a larger data type.
- It is also known as upcasting because the value is casted to a "higher" data type.
- Widening type casting is done when the target data type can safely represent all possible
  values of the source data type.
- In Java, byte can be implicitly converted to short, short to int, and char to int
  through widening type casting.
- This conversion is done automatically and safely, as there is no loss of precision involved.
- Widening type casting is also known as widening conversion.
*/
