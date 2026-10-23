import strategy.Strategy;

public class Calculator {
    private Strategy strategy;

    public Calculator (Strategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public double executeStrategy(double a, double b) {
        return strategy.execute(a, b);
    }
    public String strategyName(){
        return strategy.operationName();
    }
}
