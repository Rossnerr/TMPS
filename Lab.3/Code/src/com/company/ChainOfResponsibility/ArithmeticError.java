package com.company.ChainOfResponsibility;

public class ArithmeticError extends ErrorLoger {
    public ArithmeticError(int level){
        this.level = level;
    }

    @Override
    protected void Write(String message){
        System.out.println("Arithmetic Error: " + message);
    }
}
