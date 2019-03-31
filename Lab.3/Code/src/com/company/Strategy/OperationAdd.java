package com.company.Strategy;

public class OperationAdd implements IStrategy {
    @Override
    public int DoOperation(int num1, int num2){
        return num1 + num2;
    }
}
