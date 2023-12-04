package Week7_Polymorphism_2;

import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * javadoc.
     */
    public Rectangle() {
        topLeft = new Point(1, 1);
        width = 1;
        length = 1;
    }

    /**
     * javadoc.
     */
    public Rectangle(double newWidth, double newLength) {
        width = newWidth;
        length = newLength;
    }

    /**
     * javadoc.
     */
    public Rectangle(double newWidth, double newLength, String newColor, boolean isFilled) {
        super(newColor, isFilled);
        width = newWidth;
        length = newLength;
    }

    /**
     * javadoc.
     */
    public Rectangle(Point point, double width, double length, String color, boolean isFilled) {
        super(color, isFilled);
        topLeft = point;
        this.width = width;
        this.length = length;
    }

    /**
     * javadoc.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * javadoc.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * javadoc.
     */
    public double getWidth() {
        return width;
    }

    /**
     * javadoc.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * javadoc.
     */
    public double getLength() {
        return length;
    }

    /**
     * javadoc.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * javadoc.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * javadoc.
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ",width=" + width
                + ",length=" + length + ",color=" + color + ",filled=" + filled + "]";
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
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0
                && Double.compare(length, rectangle.length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    /**
     * javadoc.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }
}
