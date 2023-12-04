package Week7_Polymorphism_2;

import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * javadoc.
     */
    public Circle() {
        center = new Point(1, 1);
        radius = 1;
    }

    /**
     * javadoc.
     */
    public Circle(double newRadius) {
        radius = newRadius;
    }

    /**
     * javadoc.
     */
    public Circle(double newRadius, String newColor, boolean isFilled) {
        super(newColor, isFilled);
        radius = newRadius;
    }

    /**
     * javadoc.
     */
    public Circle(Point newCenter, double newRadius, String newColor, boolean isFilled) {
        super(newColor, isFilled);
        center = newCenter;
        radius = newRadius;
    }

    /**
     * javadoc.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * javadoc.
     */
    public void setCenter(Point center) {
        this.center = center;
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
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * javadoc.
     */
    @Override
    public double getArea() {
        return radius * radius * 3.14159;
    }

    /**
     * javadoc.
     */
    @Override
    public double getPerimeter() {
        return 2 * 3.14159 * radius;
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius=" + radius
                + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * javadoc.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(center, circle.center);
    }

    /**
     * javadoc.
     */
    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
