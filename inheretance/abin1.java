// Interface defining engine behavior
interface Engine {
    void startEngine();
}

// Abstract class defining vehicle structure
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void drive();

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Concrete class implementing both abstract class and interface
class Car extends Vehicle implements Engine {
    Car(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println(brand + " Car is driving...");
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " Engine started.");
    }
}

public class abin1 {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla");
        myCar.displayBrand();
        myCar.startEngine();
        myCar.drive();
    }
}
