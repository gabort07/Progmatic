package com.company.Feladatok;

public class Circle {
    private double ray;
    Dot middle;

    public double getArea() {
        return ray * ray * Math.PI;
    }

    public double getCircumference() {
        return 2 * ray * Math.PI;
    }

    public boolean hasIntersection(Circle other) {
        return middle.distance(other.middle) < this.getRay() + other.getRay();
    }


    public Circle(double ray, Dot middle) {
        this.ray = ray;
        this.middle = middle;
    }

    public Circle(double ray, int x, int y){
        this.ray = ray;
        this.middle = new Dot(x,y);
    }

    public double getRay() {
        return ray;
    }
}
