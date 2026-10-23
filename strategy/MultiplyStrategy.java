package strategy;

public class MultiplyStrategy implements Strategy {
    public double execute(double a, double b) {
        return a * b;
    }
    public String operationName(){
        return "Multiplication";
    }
}
