package technology;

public class Computer extends TechnologyWithWiFi{

   private  int batteryLifeInHours = 5;
    public void turnOn(boolean powerButtonOn, int batteryLifeInHours){
    super.turnOnMachine(powerButtonOn, batteryLifeInHours);
}

    @Override
    public int getBatteryLifeInHours() {
        return batteryLifeInHours;
    }

    @Override
    public void setBatteryLifeInHours(int batteryLifeInHours) {
        this.batteryLifeInHours = batteryLifeInHours;
    }
}
