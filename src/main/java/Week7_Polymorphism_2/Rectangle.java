package Week7_Polymorphism_2;

import java.awt.*;
import java.util.Objects;
import java.util.Random;

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

    @Override
    public void move() {
        topLeft.setPointX(topLeft.getPointX() + velocityX);
        topLeft.setPointY(topLeft.getPointY() + velocityY);
    }

    @Override
    public void draw(Graphics g) {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color randomColor = new Color(red, green, blue);

        g.setColor(randomColor);

        int x = (int) topLeft.getPointX();
        int y = (int) topLeft.getPointY();
        int width = (int) this.width;
        int height = (int) this.length;

        g.drawRect(x, y, width, height);
    }

    public boolean collidesWith(Shape other) {
        if (other instanceof Rectangle otherRectangle) {
        } else if (other instanceof Circle circle) {
        }
        return false;
    }

    public boolean collidesWithFrame(int frameWidth, int frameHeight) {
        return topLeft.getPointX() <= 0 || topLeft.getPointX() + width >= frameWidth ||
                topLeft.getPointY() <= 0 || topLeft.getPointY() + length >= frameHeight;
    }

    public void reverseDirection() {
        Random random = new Random();
        double maxSpeed = 5.0;
        double minSpeed = 1.0;

        double newVelocityX = (random.nextDouble() * (maxSpeed - minSpeed)) + minSpeed;
        double newVelocityY = (random.nextDouble() * (maxSpeed - minSpeed)) + minSpeed;

        if (random.nextBoolean()) {
            newVelocityX = -newVelocityX;
        }
        if (random.nextBoolean()) {
            newVelocityY = -newVelocityY;
        }

        setVelocity(newVelocityX, newVelocityY);
    }

    private void setVelocity(double newVelocityX, double newVelocityY) {
        this.velocityX = newVelocityX;
        this.velocityY = newVelocityY;
    }

}
