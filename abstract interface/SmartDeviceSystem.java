
interface Bluetooth {
    void connectBluetooth();
}


interface WiFi {
    void connectWiFi();
}


abstract class SmartDevice {
    String model;

    SmartDevice(String model) {
        this.model = model;
    }

    abstract void powerOn();
}


class Smartphone extends SmartDevice implements Bluetooth, WiFi {
    Smartphone(String model) {
        super(model);
    }

    @Override
    void powerOn() {
        System.out.println(model + " is powering on...");
    }

    @Override
    public void connectBluetooth() {
        System.out.println(model + " connected to Bluetooth.");
    }

    @Override
    public void connectWiFi() {
        System.out.println(model + " connected to WiFi.");
    }
}

public class SmartDeviceSystem {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("iPhone 14");
        phone.powerOn();
        phone.connectBluetooth();
        phone.connectWiFi();
    }
}
