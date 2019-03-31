package com.company.ChainOfResponsibility;

public class SyntaxError extends ErrorLoger {
    public SyntaxError(int level){
        this.level = level;
    }

    @Override
    protected void Write(String message){
        System.out.println("Syntax Error: " + message);
    }
}
