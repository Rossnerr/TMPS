package com.company.Factory;

import com.company.Driver.IDriver;

public interface IDriverFactory {
    IDriver CreateDriver(String fn, String ln, int age);
}
