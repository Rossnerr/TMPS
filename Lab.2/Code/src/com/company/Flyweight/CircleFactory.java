package com.company.Flyweight;

import com.company.RoundedShapes.Circle;
import com.company.Bridge.DrawAPI;
import com.company.RoundedShapes.RoundedShape;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap circleMap = new HashMap();

    public static RoundedShape getCircle(int radius, DrawAPI drawAPI){
        Circle circle = (Circle) circleMap.get(radius);

        if(circle == null){
            circle = new Circle(10, 10, radius, drawAPI);
            circleMap.put(radius, circle);
            System.out.println("Creating circle with radius: " + radius);
        }
        return circle;
    }
}
