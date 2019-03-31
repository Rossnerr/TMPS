package com.company.ChainOfResponsibility;

public abstract class ErrorLoger {
    public static int SYNTAX = 1;
    public static int ARITHMETIC = 2;

    protected int level;

    protected ErrorLoger nextLogger;

    public void SetNextLogger(ErrorLoger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void LogMessage(int level, String message){
        if(this.level == level){
            Write(message);
        }

        if(nextLogger != null){
            nextLogger.LogMessage(level, message);
        }
    }

    abstract protected void Write(String message);
}
