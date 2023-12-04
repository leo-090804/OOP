package Week9_Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(3.75646, 5.524315);
        Point p1 = new Point(2.52, 426.14);
        Point p2 = new Point(5.32, 75.4);
        Point p3 = new Point(6.2,7.4235);
        Point p4 = new Point(6.2,7.4235);

        Circle circle1 = new Circle(center, 5);
        System.out.println((circle1.getInfo()));
        System.out.println((circle1.getArea()));
        System.out.println(circle1.getPerimeter());

        Circle circle2 = new Circle(p1, 6);
        Circle circle3 = new Circle(p2, 7.65);
        Circle circle4 = new Circle(p3, 8.23);

        Triangle triangle1 = new Triangle(p1, p2, p3);
        Triangle triangle2 = new Triangle(p1, p3, p4);

        List<GeometricObject>shapeList = new ArrayList<>();
        shapeList.add(circle1);
        shapeList.add(triangle1);
        shapeList.add(circle2);
        shapeList.add(circle3);
        shapeList.add(circle4);
        shapeList.add(triangle2);

        ShapeUtil shapes = new ShapeUtil();
        System.out.println (shapes.printInfo(shapeList));
    }
}