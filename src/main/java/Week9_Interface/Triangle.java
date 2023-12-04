package Week9_Interface;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    private boolean isCollinear(Point a, Point b, Point c) {
        return (a.getPointX() * (b.getPointY() - c.getPointY())
                + b.getPointX() * (c.getPointY() - a.getPointY())
                + c.getPointX() * (a.getPointY() - b.getPointY())) == 0;
    }

    Triangle(Point newP1, Point newP2, Point newP3) throws RuntimeException {
//        try {
//            if (isCollinear(newP1, newP2, newP3)) {
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e){
//            p1 = new Point(0,0);
//            p2 = new Point(0,0);
//            p3 = new Point(0,0);
//            return;
//        }
//        try {
//            if (newP1.equals(newP2) || newP1.equals(newP3) || newP2.equals(newP3)) {
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e) {
//            p1 = new Point(0,0);
//            p2 = new Point(0,0);
//            p3 = new Point(0,0);
//            return;
//        }

        if (isCollinear(newP1, newP2, newP3)) {
            throw new RuntimeException();
        }

        if (newP1.equals(newP2) || newP1.equals(newP3) || newP2.equals(newP3)) {
            throw new RuntimeException();
        }

        p1 = newP1;
        p2 = newP2;
        p3 = newP3;

    }

    public Point getP1() {
        return p1;
    }


    public Point getP2() {
        return p2;
    }


    public Point getP3() {
        return p3;
    }


    @Override
    public double getArea() {
        return 0.5 * Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY()));
    }

    @Override
    public double getPerimeter() {
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        return side1 + side2 + side3;
    }

    @Override
    public String getInfo() {
        return "Triangle[("
                + String.format("%.2f", p1.getPointX()) + ","
                + String.format("%.2f", p1.getPointY()) + "),("
                + String.format("%.2f", p2.getPointX()) + ","
                + String.format("%.2f", p2.getPointY()) + "),("
                + String.format("%.2f", p3.getPointX()) + ","
                + String.format("%.2f", p3.getPointY()) + ")]";
    }
}
