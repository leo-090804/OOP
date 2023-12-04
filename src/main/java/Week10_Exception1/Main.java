package Week10_Exception1;

public class Main {
    public static void main(String[] args) {


        Expression ten = new Numeral(10);
        Expression two = new Numeral(2);
        Expression three = new Numeral(3);
        Expression four = new Numeral(4);

        Expression tenSquared = new Square(ten);
        Expression fourTimesThree = new Multiplication(four, three);

        Expression subtractThree = new Subtraction(tenSquared, three);
        Expression addFourTimesThree = new Addition(subtractThree, fourTimesThree);

        Expression finalExpression = new Square(addFourTimesThree);


        System.out.printf(finalExpression.toString());
        System.out.printf(" = " + finalExpression.evaluate() + "\n");

        // xyz + zyz - x^3;
        // x = 3, y = 2, z = 2;
        Expression x = new Numeral(3);
        Expression y = new Numeral(2);
        Expression z = new Numeral(2);

        Expression xy;
        Expression zy;
        Expression xyz = new Multiplication(xy = new Multiplication(x, y), z);
        Expression zyz = new Multiplication(zy = new Multiplication(z, y), z);

        Expression x2;
        Expression x3 = new Multiplication(x2 = new Square(x), x);

        Expression r1;
        Expression r2 = new Subtraction(r1 = new Addition(xyz, zyz), x3);

        System.out.printf(r2.toString());
        System.out.printf(" = " + r2.evaluate() + "\n");
    }
}
