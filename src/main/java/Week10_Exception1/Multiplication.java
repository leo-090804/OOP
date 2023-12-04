package Week10_Exception1;

public class Multiplication extends BinaryExpression{
    Multiplication (Expression newLeft, Expression newRight){
        super(newLeft, newRight);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
