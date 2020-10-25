package com.company.Feladatok.Utepites;

public class Car {
    private int hour;
    private int min;
    private int sec;
    private int elapsedTime;
    String village;

    public Car(int hour, int min, int sec, int elapsedTime, String village) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.elapsedTime = elapsedTime;
        this.village = village;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}
