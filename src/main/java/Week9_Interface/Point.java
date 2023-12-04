package Week9_Interface;

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
}
