package Week10_Exception1;

public class Addition extends BinaryExpression {
    Addition (Expression newLeft, Expression newRight){
        super(newLeft, newRight);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
