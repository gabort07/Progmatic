package Shapes;

public class Hexagon implements Shape{
    double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double area() {
       return  (3*Math.sqrt(3))/2 *(a*a);
    }

    @Override
    public double perimeter() {
        return 6*a;
    }
}
