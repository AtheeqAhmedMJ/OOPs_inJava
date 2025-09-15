abstract class Appliance {
    protected boolean power = false;

    abstract void turnOn();
    abstract void turnOff();

    void status() {
        if (power)
            System.out.println(this.getClass().getSimpleName() + " is currently ON.");
        else
            System.out.println(this.getClass().getSimpleName() + " is currently OFF.");
    }
}

interface SmartFeatures {
    void connectWiFi(String networkName);
    void updateFirmware();
}

class SmartFan extends Appliance implements SmartFeatures {
    @Override
    void turnOn() {
        power = true;
        System.out.println("SmartFan is now ON.");
    }

    @Override
    void turnOff() {
        power = false;
        System.out.println("SmartFan is now OFF.");
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("Connected SmartFan to WiFi: " + networkName);
    }

    @Override
    public void updateFirmware() {
        System.out.println("SmartFan Firmware Updated Successfully.");
    }
}

class SmartLight extends Appliance implements SmartFeatures {
    @Override
    void turnOn() {
        power = true;
        System.out.println("SmartLight is now ON.");
    }

    @Override
    void turnOff() {
        power = false;
        System.out.println("SmartLight is now OFF.");
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("Connected SmartLight to WiFi: " + networkName);
    }

    @Override
    public void updateFirmware() {
        System.out.println("SmartLight Firmware Updated Successfully.");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartFan fan = new SmartFan();
        SmartLight light = new SmartLight();

        fan.turnOn();
        fan.connectWiFi("Home_Network");
        fan.updateFirmware();
        fan.status();

        System.out.println();

        light.turnOn();
        light.connectWiFi("Home_Network");
        light.updateFirmware();
        light.status();

        System.out.println();

        fan.turnOff();
        light.turnOff();
    }
}
