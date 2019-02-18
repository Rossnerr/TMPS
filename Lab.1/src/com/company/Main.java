package com.company;

import com.company.Car.Car;
import com.company.Driver.Driver;
import com.company.Factory.*;
import com.company.Race.Race;

public class Main {

    public static void main(String[] args) {
        AbstractFactory object = (AbstractFactory) Singleton.getInstance().abstractFactory;

        CarFactory carFactory = (CarFactory) object.getCarFactory();

        DriverFactory driverFactory = (DriverFactory) object.getDriverFactory();

        RaceFactory raceFactory = RaceFactory.getInstance();

        Car car = carFactory.CreateCar("Mercedes");

        Driver driver = (Driver) driverFactory.CreateDriver("Lewis", "Hamilton", 34);

        Driver driver1 = (Driver) driver.Clone();

        driver1.setFirstName("Fernando");
        driver1.setLastName("Alonso");
        driver1.setAge(37);

        Race race = raceFactory.getRace("GrandPrix");

        car.PresentYourself();
        System.out.println("\n");

        driver.PresentYourself();
        System.out.println("\n");

        driver1.PresentYourself();
        System.out.println("\n");

        race.PresentYourself();
    }
}