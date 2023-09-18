package technology;

public abstract class TechnologyWithWiFi {
    private int batteryLifeInHours;
   private final boolean abilityToAccessTheInternet = true;
   private boolean powerButtonOn = false;
   private int classID;

    public static void turnOnMachine(boolean powerButtonOn, int batteryLifeInHours){
        if(batteryLifeInHours > 0){
            powerButtonOn = true;
        }
        if(powerButtonOn == true) {
            System.out.println("Powering on...");
        }
    }

    public static void connectToWiFi(){
        System.out.println("Connecting...");
    }

    public int getBatteryLifeInHours() {
        return batteryLifeInHours;
    }



    public void setBatteryLifeInHours(int batteryLifeInHours) {
        this.batteryLifeInHours = batteryLifeInHours;
    }

    public boolean isAbilityToAccessTheInternet() {
        return abilityToAccessTheInternet;
    }

    public boolean isPowerButtonOn() {
        return powerButtonOn;
    }

    public void setPowerButtonOn(boolean powerButtonOn) {
        this.powerButtonOn = powerButtonOn;
    }
}

