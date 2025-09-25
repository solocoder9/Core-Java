class ParentClass {
    int a = 15;
}

class ChildClass extends ParentClass {
    void display() {
        System.out.println(super.a);
    }
}

public class Case1 {
    public static void main(String[] args) {
        ChildClass cs = new ChildClass();
        cs.display();
    }
}
