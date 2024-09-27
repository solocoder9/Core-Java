public class FactoryMethodExample {

    // Abstract Product
    abstract static class Product {
        public abstract void use();
    }

    // Concrete Product A
    static class ConcreteProductA extends Product {
        public void use() {
            System.out.println("Using Product A");
        }
    }

    // Creator
    abstract static class Creator {
        public abstract Product factoryMethod();
    }

    // Concrete Creator A
    static class ConcreteCreatorA extends Creator {
        public Product factoryMethod() {
            return new ConcreteProductA();
        }
    }

    // Main method to demonstrate the pattern
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.factoryMethod();
        product.use();
    }
}
