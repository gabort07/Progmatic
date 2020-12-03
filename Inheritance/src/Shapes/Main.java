package Shapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Shape> shapeList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {

//        shapeList.add(new Circle(15));
//        shapeList.add(new Rectangle(8));
//        shapeList.add(new IsoscelesTriangle(7, 5));
//        shapeList.add(new Triangle(12));
//        shapeList.add(new Hexagon(7));

        readFile("files/shapes.csv");

        for (Shape shape : shapeList) {
            printInfo(shape);
        }


    }

    public static void printInfo(Shape s) {
        System.out.println(s.getClass().getCanonicalName() + ": ");
        System.out.println("Területe: " + s.area());
        System.out.println("Kerülete: " + s.perimeter());
        if (s.area() < s.perimeter()) {
            System.out.println("egy sovány alakzat");
        } else if (s.area() == s.perimeter()) {
            System.out.println("egy tökéletes alakzat");
        } else {
            System.out.println("egy kövér alakzat");
        }
        System.out.println("A kerület és a terület aránya: " + s.perimeter() / s.area());
    }

    public static void readFile(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        while (sc.hasNextLine()) {
            String[] shape = sc.nextLine().split(",");
            makeShape(shape);
        }

    }

    public static void makeShape(String[] data) {
        String form = data[0];
        int size = Integer.parseInt(data[1]);
        switch (form) {
            case "0":
                shapeList.add(new Circle(size));
                break;
            case "3":
                shapeList.add(new Triangle(size));
                break;
            case "4":
                shapeList.add(new Rectangle(size));
                break;
            case "6":
                shapeList.add(new Hexagon(size));
        }
    }

    public static void getLargestShape(List<Shape> shapes) {

    }
}
