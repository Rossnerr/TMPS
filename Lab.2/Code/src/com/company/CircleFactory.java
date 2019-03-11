package com.company;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap circleMap = new HashMap();

    public static RoundedShape getCircle(int radius){
        Circle circle = (Circle)circleMap.get(radius);

        if(circle == null){
            circle = new Circle(10, 10, radius, new RedCircle());
            circleMap.put(radius, circle);
            System.out.println("Creating circle with radius: " + radius);
        }
        return circle;
    }
}
