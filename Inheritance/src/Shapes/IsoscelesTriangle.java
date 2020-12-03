package Shapes;

public class IsoscelesTriangle implements Shape {

    double a;
    double b;

    public IsoscelesTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double h = Math.sqrt((b * b) - (a * a) / 4);
        return a * h / 2;

    }

    @Override
    public double perimeter() {
        return 2 * b + a;
    }
}
