package com.company.Car;

public class CarBuilder implements ICarBuilder {
    private Car car;

    public CarBuilder(String name){
        car = new Car(name);
    }

    public void BuildEngine(String e){
        car.Engine = e;
    }

    public Car BuildCar(){
        return car;
    }
}
