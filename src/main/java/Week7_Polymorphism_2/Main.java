package Week7_Polymorphism_2;



public class Main {
    public static void main(String[] args) {
        Point newPoint = new Point(10,10);
        Point new2ndPoint = new Point(20,10);
        System.out.println(newPoint.distance(new2ndPoint));
        System.out.println(newPoint.toString());
        System.out.println(newPoint.hashCode());
        System.out.println(new2ndPoint.hashCode());
        System.out.println(newPoint.equals(new2ndPoint));

        Shape newCircle = new Circle(newPoint, 5, "red" , false);
        System.out.println(newCircle.getArea());
        System.out.println(newCircle.getPerimeter());
        System.out.println(newCircle.toString());
        System.out.println(newCircle.hashCode());

        Shape newRec = new Rectangle(new2ndPoint, 10, 30, "blue", true);
        System.out.println(newRec.getArea());
        System.out.println(newRec.getPerimeter());
        System.out.println(newRec.toString());
        System.out.println(newRec.hashCode());

        Shape newRec2 = new Rectangle(new2ndPoint, 10, 30, "blue", true);
        System.out.println(newRec2.getArea());
        System.out.println(newRec2.getPerimeter());
        System.out.println(newRec2.toString());
        System.out.println(newRec2.hashCode());

        Shape newSqr = new Square(newPoint,6.6, "green", true);
        System.out.println(newSqr.getArea());
        System.out.println(newSqr.getPerimeter());
        System.out.println(newSqr.toString());
        System.out.println(newSqr.hashCode());

        Layer list = new Layer();
        list.addShape(newSqr);
        list.addShape(newCircle);
        list.addShape(newRec);
        list.removeCircles();
        list.removeDuplicates();
        System.out.println(list.getInfo());
    }
}
