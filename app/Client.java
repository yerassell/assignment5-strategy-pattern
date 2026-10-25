package app;

import strategy.AddStrategy;
import strategy.DivideStrategy;
import strategy.MultiplyStrategy;
import strategy.SubtractStrategy;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println(calculator.strategyName() + ": " + calculator.executeStrategy(6, 2));
        calculator.setStrategy(new SubtractStrategy());
        System.out.println(calculator.strategyName() + ": " + calculator.executeStrategy(6, 2));
        calculator.setStrategy(new MultiplyStrategy());
        System.out.println(calculator.strategyName() + ": " + calculator.executeStrategy(6, 2));
        calculator.setStrategy(new DivideStrategy());
        System.out.println(calculator.strategyName() + ": " + calculator.executeStrategy(6, 2));
    }
}
