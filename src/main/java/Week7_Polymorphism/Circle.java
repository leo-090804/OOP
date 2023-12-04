package Week7_Polymorphism;

public class Circle extends Shape {
    protected double radius;

    /**
     * javadoc.
     */
    public Circle() {
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
        return 2 * radius * 3.14159;
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
