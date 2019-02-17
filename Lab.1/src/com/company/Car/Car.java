package com.company.Car;

public class Car {
    public String Name;
    public String Engine;

    public Car(String name){
        this.Name = name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getName() {
        return Name;
    }

    public String getEngine() {
        return Engine;
    }

    public void PresentYourself(){
        System.out.println("Name : " + this.Name + "\nEngine : " + this.Engine);
    }
}
