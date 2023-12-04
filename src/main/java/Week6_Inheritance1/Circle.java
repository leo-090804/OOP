package Week6_Inheritance1;

public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14159;

    /**
     * javadoc.
     */
    public Circle() {
        radius = 1;
        color = "White";
    }

    /**
     * javadoc.
     */
    public Circle(double newRadius) {
        radius = newRadius;
        color = "White";
    }

    /**
     * javadoc.
     */
    public Circle(double newRadius, String newColor) {
        radius = newRadius;
        color = newColor;
    }

    /**
     * javadoc.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * javadoc.
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /**
     * javadoc.
     */
    public String getColor() {
        return color;
    }

    /**
     * javadoc.
     */
    public void setColor(String newColor) {
        color = newColor;
    }

    /**
     * javadoc.
     */
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}

