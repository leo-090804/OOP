package Week7_Polymorphism_2;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    /**
     * javadoc.
     */
    public Square(double newSide) {
        super(newSide, newSide);
    }

    /**
     * javadoc.
     */
    public Square(double newSide, String newColor, boolean isFilled) {
        super(newSide, newSide, newColor, isFilled);
    }

    /**
     * javadoc.
     */
    public Square(Point newPoint, double newSide, String newColor, boolean isFilled) {
        super(newPoint, newSide, newSide, newColor, isFilled);
    }

    /**
     * javadoc.
     */
    public double getSide() {
        return super.getWidth();
    }

    /**
     * javadoc.
     */
    public void setSide(double newSide) {
        super.setWidth(newSide);
    }

    /**
     * javadoc.
     */
    public void setWidth(double newSide) {
        super.setWidth(newSide);
    }

    /**
     * javadoc.
     */
    public void setLength(double newSide) {
        super.setLength(newSide);
    }

    /**
     * javadoc.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * javadoc.
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft + ",side=" + getSide()
                + ",color=" + color + ",filled=" + filled + "]";
    }
}
