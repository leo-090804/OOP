package Week10_Exception1;

public class Numeral extends Expression{
    private double value;
    public Numeral() {
        value = 1;
    }
    public Numeral (double newValue){
        value = newValue;
    }

    @Override
    public String toString() {
        return String.format("%.0f",value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
