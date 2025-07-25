abstract class Appliance {
    abstract void turnOn();
}

interface Connectable {
    void connect();
}

class SmartTV extends Appliance implements Connectable {

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void connect() {
        System.out.println("TV connected to WiFi");
    }
}

public class Task8 {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.connect();
    }
}
