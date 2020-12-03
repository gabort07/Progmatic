package Shapes;

public class Circle implements Shape{

    private int ray;

    public Circle(int ray) {
        this.ray = ray;
    }

    @Override
    public double area() {
        return (ray*ray)*Math.PI;
    }

    @Override
    public double perimeter() {
        return 2*ray*Math.PI;
    }
}
