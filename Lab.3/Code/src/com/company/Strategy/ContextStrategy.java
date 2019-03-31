package com.company.Strategy;

public class ContextStrategy {
    private IStrategy strategy;

    public ContextStrategy(IStrategy strategy){
        this.strategy = strategy;
    }

    public int ExecuteStrategy(int num1, int num2){
        return strategy.DoOperation(num1, num2);
    }
}
