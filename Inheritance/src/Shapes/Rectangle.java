package Shapes;

public class Rectangle implements Shape{
    double a;

    public Rectangle(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a;
    }
}
