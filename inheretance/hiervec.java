
class Vehicle {
    String modelName;
    String manufacturer;

    Vehicle(String modelName, String manufacturer) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
    }

    void start() {
        System.out.println(manufacturer + " " + modelName + " is starting...");
    }
}


class Car extends Vehicle {
    int numSeats;

    Car(String modelName, String manufacturer, int numSeats) {
        super(modelName, manufacturer);
        this.numSeats = numSeats;
    }

    void drive() {
        System.out.println(manufacturer + " " + modelName + " (Car) with " + numSeats + " seats is being driven.");
    }
}


class Bike extends Vehicle {
    boolean hasABS;

    Bike(String modelName, String manufacturer, boolean hasABS) {
        super(modelName, manufacturer);
        this.hasABS = hasABS;
    }

    void ride() {
        System.out.println(manufacturer + " " + modelName + " (Bike) is being ridden. ABS: " + (hasABS ? "Enabled" : "Disabled"));
    }
}


public class hiervec {
    public static void main(String[] args) {
        Car car = new Car("Model S", "Tesla", 5);
        car.start();
        car.drive();

        System.out.println();

        Bike bike = new Bike("Ninja ZX-10R", "Kawasaki", true);
        bike.start();
        bike.ride();
    }
}
