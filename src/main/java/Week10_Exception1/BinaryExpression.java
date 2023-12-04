package Week10_Exception1;

public abstract class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;
    public BinaryExpression(Expression newLeft, Expression newRight){
        left = newLeft;
        right = newRight;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public double evaluate() {
        return 0;
    }
}
