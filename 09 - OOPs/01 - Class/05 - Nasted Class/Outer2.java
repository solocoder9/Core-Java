// Inner Class / Non - static nasted class

public class Outer2 {
    
    private int outerField = 10;

    // Member Inner Class
    public class Inner {
        public void display() {
            System.out.println("Value of outer field in inner: " + outerField);
        }
    }

    public void outerMethod() {
        // Local Inner Class 
        class LocalInner {
            void display() {
                System.out.println("Local Inner: " + outerField); 
            }
        }

        LocalInner li = new LocalInner();
        li.display();
    }

    public void anonymousInnerMethod() {
    // Anonymous Inner Class
    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Anonymous Inner: " + outerField);
        }
    };
    new Thread(r).start();
}

    public static void main(String[] args) {

        Outer2 ot = new Outer2();

        // Accessing Member inner class
        Outer2.Inner in = ot.new Inner();
        in.display();

        // Accessing local Inner class
        ot.outerMethod();

        // Accessing Anonumous inner class
        ot.anonymousInnerMethod();
    }
}
