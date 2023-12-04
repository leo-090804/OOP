package Week7_Polymorphism_2;

import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * javadoc.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * javadoc.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * javadoc.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * javadoc.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * javadoc.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * javadoc.
     */
    public double distance(Point newPoint) {
        double d = Math.sqrt(Math.pow((newPoint.pointX - pointX), 2)
                + Math.pow((newPoint.pointY - pointY), 2));
        return d;
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
        Point point = (Point) o;
        return Double.compare(pointX, point.pointX) == 0
                && Double.compare(pointY, point.pointY) == 0;
    }

    /**
     * javadoc.
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * javadoc.
     */
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
