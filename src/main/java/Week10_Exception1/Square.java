package Week10_Exception1;

public class Square extends Expression{
    private Expression expression;
    public Square(Expression newExpression){
        expression = newExpression;
    }

    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }
}
