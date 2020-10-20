package com.company.Feladatok.VacumCleaner;

public class VacumCleaner {
    private boolean plugedIn;
    private boolean powerOn;
    private boolean isFull;
    private int fullness;
    private int bagSize;

    public VacumCleaner(boolean plugedIn, boolean powerOn, int bagSize) {
        this.plugedIn = plugedIn;
        this.powerOn = powerOn;
        this.bagSize = bagSize;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public void setPlugedIn(boolean plugedIn) {
        this.plugedIn = plugedIn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void setBagSize(int bagSize) {
        this.bagSize = bagSize;
    }

    public boolean isPlugedIn() {
        return plugedIn;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public boolean isFull() {
        return isFull;
    }

    public int getBagSize() {
        return bagSize;
    }

    public int getFullness() {
        return fullness;
    }

    public boolean ready() {
        return isPlugedIn() && isPowerOn() && !isFull();
    }

    public void bagStatus() {
        setFull(getFullness() == getBagSize());
    }
}
