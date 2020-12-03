package Bicicle;

public class Bicicle {

    private double wheelSize;
    private int frontGear;
    private int[] rearGear;
    private int shift;
    private double speed;
    private double rps;

    public Bicicle() {
    }

    public Bicicle(double wheelSize, int frontGear, int[] rearGear) {
        this.wheelSize = wheelSize;
        this.frontGear = frontGear;
        this.rearGear = rearGear;
    }

    public int getShift() {
        return shift;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    public int getFrontGear() {
        return frontGear;
    }

    public int getRearGear(int index) {
        return rearGear[index - 1];
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setRps(double rps) {
        this.rps = rps;
    }

    public double getRps() {
        return rps;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed(double rps) {
        //        forudlatszám * (első fogaskerék fogainak száma / hátsó fogaskerék fogainak száma) * kerékátmérő.
        return rps * (getFrontGear() / getRearGear(getShift())) * (getWheelSize() * Math.PI);
    }

    public double getRps(double speed) {
        return speed / (getWheelSize() * Math.PI) / (getFrontGear() / getRearGear(getShift()));
    }
}


