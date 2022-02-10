#create a class lamp to check whether the lamp is on or off

class Lamp{
    boolean ison;
    public void turnOff() {
        ison = false;
        System.out.println("lights on ?"+ison);
    }

    public void turnOn() {
        ison = true;
        System.out.println("lights on ?"+ison);
    }
}


public class demo {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        led.turnOn();
        led.turnOff();
    }
}
