package strategy;

public class SubtractStrategy implements Strategy {
    public double execute(double a, double b) {
        return a - b;
    }
    public String operationName(){
        return "Subtraction";
    }
}
