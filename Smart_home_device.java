class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {}
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Thermostat ID: " + deviceId + " Status: " + status + " Temperature: " + temperatureSetting);
    }
}

public class Smart_home_device {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(101, "ON", 24);
        t.displayStatus();
    }
}