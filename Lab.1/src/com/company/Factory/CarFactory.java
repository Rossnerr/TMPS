package com.company.Factory;

import com.company.Car.Car;
import com.company.Car.CarBuilder;
import com.company.Car.ICarBuilder;

public class CarFactory implements ICarFactory {
    @Override
    public Car CreateCar(String name){
        ICarBuilder builder = new CarBuilder(name);

        if(name.equalsIgnoreCase("MERCEDES")){
            builder.BuildEngine("Good");
            return builder.BuildCar();
        }
        return null;
    }
}
