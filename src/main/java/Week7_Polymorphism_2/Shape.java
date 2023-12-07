package Week7_Polymorphism_2;

import java.awt.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected double velocityX;
    protected double velocityY;

    /**
     * javadoc.
     */
    public Shape() {
        color = "nocolor";
        filled = false;
        velocityX = 10;
        velocityY = 10;
    }

    /**
     * javadoc.
     */
    public Shape(String newColor, boolean isFilled) {
        color = newColor;
        filled = isFilled;
        velocityX = 10;
        velocityY = 10;
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

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public abstract void move();

    public abstract void draw(Graphics g);

    /**
     * javadoc.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
