final class Test {
    private int i;

    Test(int i) {
        this.i = i;
    }

    // Returns a new instance if the value changes, otherwise returns the same instance
    public Test modify(int i) {
        if (this.i == i) {
            return this; // returns the same instance if the value is unchanged
        } else {
            return new Test(i); // returns a new instance if the value changes
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = t1.modify(100);
        Test t3 = t1.modify(10);

        System.out.println(t1 == t2); // false (different instances)
        System.out.println(t1 == t3); // true (same instance)
    }
}

/*
 * Explanation:
 *
 * 1. The `Test` class is designed to be immutable by creating new instances when changes are needed.
 *    - The field `i` is not declared `final`, but the immutability is maintained through the `modify` method.
 * 2. The `modify` method returns a new instance of `Test` if the provided value differs from the current value.
 *    - If the new value is the same, it returns the existing instance to avoid unnecessary object creation.
 * 3. `t1 == t2` is `false` because `t2` is a new instance created with a different value.
 *    `t1 == t3` is `true` because `t3` is the same instance as `t1` (value unchanged).
 */
