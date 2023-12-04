package Week10_Exception1;

public class Subtraction extends BinaryExpression {
    Subtraction (Expression newLeft, Expression newRight){
        super(newLeft, newRight);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
