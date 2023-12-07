package Week7_Polymorphism_2;

import java.awt.*;
import java.util.Objects;
import java.util.Random;

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

    @Override
    public void move() {
        center.setPointX(center.getPointX() + velocityX);
        center.setPointY(center.getPointY() + velocityY);
    }

    @Override
    public void draw(Graphics g) {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        Color randomColor = new Color(red, green, blue);

        g.setColor(randomColor);

        int x = (int) (center.getPointX() - radius);
        int y = (int) (center.getPointY() - radius);
        int diameter = (int) (2 * radius);

        g.drawOval(x, y, diameter, diameter);
    }

    public boolean collidesWithFrame(int frameWidth, int frameHeight) {
        return center.getPointX() - radius <= 0 || center.getPointX() + radius >= frameWidth ||
                center.getPointY() - radius <= 0 || center.getPointY() + radius >= frameHeight;
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