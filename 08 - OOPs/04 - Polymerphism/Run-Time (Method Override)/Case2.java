class A {
    public Object m1() {
        return null;
    }
}

class B extends A {
    @Override
    public String m1() {
        return null;
    }

    /*
     * In method overriding, the return type must be the
     * same as the overridden method's return type.
     * However, until version 1.4, and from version 1.5 onward,
     * covariant return types are also allowed.
     */
}

public class Case2 {
    public static void main(String[] args) {

    }
}
