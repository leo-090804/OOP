package Week7_Polymorphism;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * javadoc.
     */
    public Rectangle() {
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
    public Rectangle(double newWtdth, double newLength, String newColor, boolean isFilled) {
        super(newColor, isFilled);
        width = newWtdth;
        length = newLength;
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
        return length * width;
    }

    /**
     * javadoc.
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    /**
     * javadoc.
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + ",color=" + color + ",filled=" + filled + "]";
    }
}
