package Week7_Polymorphism;

public class Square extends Rectangle {
    public Square(double newSide) {
        super(newSide, newSide);
    }

    /**
     * javadoc.
     */
    public Square() {
        super();
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
    public double getSide() {
        return super.getWidth();
    }

    /**
     * javadoc.
     */
    public void setSide(double newSide) {
        super.setWidth(newSide);
        super.setLength(newSide);
    }

    /**
     * javadoc.
     */

    @Override
    public void setWidth(double newWidth) {
        setSide(newWidth);
    }

    /**
     * javadoc.
     */
    @Override
    public void setLength(double newLength) {
        setSide(newLength);
    }

    /**
     * javadoc.
     */
    @Override
    public String toString() {
        return "Square[side=" + getSide() + ",color=" + color + ",filled=" + filled + "]";
    }
}
