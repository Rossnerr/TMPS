package com.company.Bridge;

import com.company.Bridge.DrawAPI;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y){
        System.out.println("Red Circle with radius " + radius + ", x: " + x + ", y:" + y);
    }
}
