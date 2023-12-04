package Week6_Inheritance1;

public class Cylinder extends Circle {
    private double height;

    /**
     * javadoc.
     */
    public Cylinder() {
        super();
        height = 1;
    }

    /**
     * javadoc.
     */
    public Cylinder(double newHeight) {
        height = newHeight;
    }

    /**
     * javadoc.
     */
    public Cylinder(double newRadius, double newHeight) {
        super(newRadius);
        height = newHeight;
    }

    /**
     * javadoc.
     */
    public Cylinder(double newRadius, double newHeight, String newColor) {
        super(newRadius, newColor);
        height = newHeight;
    }

    /**
     * javadoc.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * javadoc.
     */
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    /**
     * javadoc.
     */
    public double getVolume() {
        return getArea() * height;
    }

    /**
     * javadoc.
     */
    @Override
    public double getArea() {
        return super.getArea() * 2;
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}