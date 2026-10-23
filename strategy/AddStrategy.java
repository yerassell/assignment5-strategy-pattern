package strategy;

public class AddStrategy implements Strategy {
    public double execute(double a, double b) {
        return a + b;
    }
    public String operationName(){
        return "Addition";
    }
}
