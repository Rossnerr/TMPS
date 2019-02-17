package com.company.Factory;

public class Singleton {
    private static Singleton instance;

    public IAbstractFactory abstractFactory = new AbstractFactory();

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}