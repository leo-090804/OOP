package Week9_Interface;

public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    Circle(Point newCenter, double newRadius) {
        center = newCenter;
        radius = newRadius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String getInfo() {
        return "Circle[(" + String.format("%.2f", center.getPointX()) + ","
                + String.format("%.2f", center.getPointY()) + "),r="
                + String.format("%.2f", radius) + "]";
    }
}