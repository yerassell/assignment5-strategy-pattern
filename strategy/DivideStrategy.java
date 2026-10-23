package strategy;

public class DivideStrategy implements Strategy {
    public double execute(double a, double b) {
        if (b == 0.0) throw new ArithmeticException("Cannot be divided by 0");
        return a / b;
    }
    public String operationName(){
        return "Division";
    }
}
