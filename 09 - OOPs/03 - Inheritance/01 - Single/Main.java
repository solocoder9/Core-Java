class Parent{
    int a = 15;
}
class Child extends Parent {
    int b = 17;
    int a = 29;
    void disp() {
        System.out.println(super.a);
        System.out.println(this.a);
    }
}

