public class Case1 {

    public void m1(int i) {
        System.out.println("int-arg method");
    }

    public void m1(float f) {
        System.out.println("float-arg method");
    }

    public static void main(String[] args) {
        
        Case1 c1 = new Case1();
        c1.m1(10); // int-arg method
        c1.m1(10.0f); // float-arg method
        c1.m1('c'); // int-arg method [auto promotion]

    }
}
