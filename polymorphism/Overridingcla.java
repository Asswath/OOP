class Vehicle {
    public void displayInfo() {
        System.out.println("Generic Vehicle");
    }
}

class Car extends Vehicle {
    public void displayInfo() {
        System.out.println("Car: 4 wheels, engine");
    }
}

class Bicycle extends Vehicle {
    public void displayInfo() {
        System.out.println("Bicycle: 2 wheels, pedals");
    }
}

public class Overridingcla {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        vehicle.displayInfo();
        car.displayInfo();
        bicycle.displayInfo();
    }
}