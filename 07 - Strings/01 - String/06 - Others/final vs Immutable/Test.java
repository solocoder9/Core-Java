public class Test {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("dhoni");
        sb.append("GOAT");
        System.out.println(sb); // dhoniGOAT
    }
}

/*
 * Explanation:
 *
 * 1. The `final` keyword applied to the `StringBuffer` reference variable means that the reference `sb` 
 *    cannot be reassigned to point to a different `StringBuffer` object.
 *    - It does not make the `StringBuffer` object itself immutable.
 * 
 * 2. `StringBuffer` is mutable, so its internal state (the string it holds) can be changed. In this case,
 *    `sb.append("GOAT")` modifies the original `StringBuffer` object.
 * 
 * 3. The use of `final` ensures that `sb` always refers to the same `StringBuffer` instance, but it does 
 *    not prevent the contents of that instance from being modified.
 *    - If you tried to reassign `sb` to a new `StringBuffer` object, it would cause a compilation error 
 *      due to the `final` keyword.
 * 
 * 4. Immutable objects are those whose state cannot be changed once created. Since `StringBuffer` is 
 *    mutable, it doesn't provide immutability even if the reference variable is `final`.
 */
