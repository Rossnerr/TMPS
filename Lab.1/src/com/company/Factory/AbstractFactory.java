package com.company.Factory;

import com.company.Race.Race;

public class AbstractFactory implements IAbstractFactory{
    @Override
    public IDriverFactory getDriverFactory(){
        return new DriverFactory();
    }

    @Override
    public ICarFactory getCarFactory(){
        return new CarFactory();
    }
}
