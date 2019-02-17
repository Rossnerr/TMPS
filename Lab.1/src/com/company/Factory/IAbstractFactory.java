package com.company.Factory;

public interface IAbstractFactory {
    IDriverFactory getDriverFactory();
    ICarFactory getCarFactory();
}
