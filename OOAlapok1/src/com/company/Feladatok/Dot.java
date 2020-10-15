package com.company.Feladatok;

public class Dot {
    private int x;
    private int y;

//    public int[] neckle(double ray){
//
//    }


    public double distance(Dot otherPoint) {
        double a = Math.abs(this.getX() - otherPoint.getX());
        double b = Math.abs(this.getY() - otherPoint.getY());
        return Math.sqrt((a * a) + (b * b));
    }

    public void printInfo() {
        System.out.println("X = " + getX() + " Y = " + getY());
        if (getX() > 0 && getY() > 0) {
            System.out.println("A pont a jobb felső részbn van");
        } else if (getX() > 0 && getY() < 0) {
            System.out.println("A pont a jobb alsó részben van");
        } else if (getX() < 0 && getY() < 0) {
            System.out.println("A pont a bal alsó részben van");
        } else if (getX() < 0 && getY() > 0) {
            System.out.println("A pont a bal felső részben van");
        }
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
