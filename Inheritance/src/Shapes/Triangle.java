package Shapes;

public class Triangle implements Shape{
    double a;
    public Triangle(double a) {
        this.a = a;
    }


    @Override
    public double area() {
        double h = Math.sqrt(3)/2*a;
        return a*h/2;
    }

    @Override
    public double perimeter() {
        return 3*a;
    }


}
