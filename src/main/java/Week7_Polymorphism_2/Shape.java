package Week7_Polymorphism_2;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * javadoc.
     */
    public Shape() {
        color = "nocolor";
        filled = false;
    }

    /**
     * javadoc.
     */
    public Shape(String newColor, boolean isFilled) {
        color = newColor;
        filled = isFilled;
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
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * javadoc.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * javadoc.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * javadoc.
     */
    public abstract double getArea();

    /**
     * javadoc.
     */
    public abstract double getPerimeter();

    /**
     * javadoc.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
