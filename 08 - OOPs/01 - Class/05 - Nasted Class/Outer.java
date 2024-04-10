// Static Nasted Class

public class Outer {
    
    private static String oSF = "Outer Static field";

    // Static class
    static class sNC {
        void display() {
            System.out.println("Accessing outer static field: " + oSF);
        }
    }

    public static void main(String[] args) {
        Outer.sNC nastedObject = new Outer.sNC();
        nastedObject.display();
    }
}
