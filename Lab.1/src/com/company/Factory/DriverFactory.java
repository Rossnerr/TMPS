package com.company.Factory;

import com.company.Driver.IDriver;
import com.company.Driver.Driver;

public class DriverFactory implements IDriverFactory {
    @Override
    public IDriver CreateDriver(String fn, String ln, int age){
        return new Driver(fn, ln, age);
    }
}
