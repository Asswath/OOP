// Base class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void showVehicle() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

interface Electric {
    void chargeBattery();
}


class Car extends Vehicle implements Electric {
    String model;
    int batteryCapacity; 

    Car(String brand, String model, int batteryCapacity) {
        super(brand);
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }

    void displayCarInfo() {
        showVehicle();
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void chargeBattery() {
        System.out.println("Charging the battery of " + model + "...");
    }
}


public class hyvs {
    public static void main(String[] args) {
        Car tesla = new Car("Tesla", "Model S", 100);
        tesla.displayCarInfo();
        tesla.chargeBattery();
    }
}
