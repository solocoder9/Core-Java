public class Test4 {

    // Static block
    static {
        System.out.println("Static block - 1");
    }
    static {
        System.out.println("Static block - 2");
    }

}

/*
 * Output: -
 * Runtime error: main method not found
 * 
 * Starting from Java 1.5, a main method is mandatory in a class 
 * to execute static blocks. Prior to Java 1.5, it was possible 
 * to declare static blocks inside a class without a main method.
 * 
 * Interview Question:-
 * Is it possible to print something in the output window without a main 
 * method?
 * Ans - yes, by using static blocks up to version 1.5
 */
