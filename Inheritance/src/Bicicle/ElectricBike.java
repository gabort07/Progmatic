package Bicicle;

public class ElectricBike extends CityBike{

    private int batteryLevel;
    private double enginePower;

    public ElectricBike(double wheelSize, int frontGear, int[] rearGear, boolean lamp, String bell, int batteryLevel, double enginePower) {
        super(wheelSize, frontGear, rearGear, lamp, bell);
        this.batteryLevel = batteryLevel;
        this.enginePower = enginePower;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }
    public void chargeBattery(){
        batteryLevel = 100;
    }



    @Override
    public double getSpeed(double rps) {
        return super.getSpeed(rps)+this.enginePower*2;
    }

    @Override
    public double getRps(double speed) {
        return super.getRps(speed);
    }
}
