// General superclass
class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Specialized subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of doors: " + numDoors);
    }
}

// Specialized subclass
class Bike extends Vehicle {
    private boolean hasBasket;

    public Bike(String brand, int year, boolean hasBasket) {
        super(brand, year);
        this.hasBasket = hasBasket;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Has basket: " + hasBasket);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", 2022);
        vehicle.display();

        System.out.println();

        Car car = new Car("Toyota", 2020, 4);
        car.display();

        System.out.println();

        Bike bike = new Bike("Giant", 2021, true);
        bike.display();
    }
}
