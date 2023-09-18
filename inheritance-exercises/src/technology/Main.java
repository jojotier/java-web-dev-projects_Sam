package technology;

public class Main {
public static void main(String[] args){
    Computer dell = new Computer();
    boolean isItOn = dell.isPowerButtonOn();
    int batteryLife = dell.getBatteryLifeInHours();
    dell.turnOn(isItOn, batteryLife);
}
}
