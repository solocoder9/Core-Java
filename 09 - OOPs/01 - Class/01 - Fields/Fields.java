public class Fields {
    int a; // field / variable
    String str; // field

    void demo() {
        this.a = 9; // set the value field
        System.out.print(a);
    }

    public static void main(String[] args) {
        Fields c1 = new Fields();
        c1.demo();
    }
}
