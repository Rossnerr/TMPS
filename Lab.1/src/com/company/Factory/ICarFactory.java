package com.company.Factory;

import com.company.Car.Car;

public interface ICarFactory {
    Car CreateCar(String name);
}
