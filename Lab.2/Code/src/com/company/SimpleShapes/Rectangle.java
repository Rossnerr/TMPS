package com.company.SimpleShapes;

public class Rectangle implements SimpleShape {
    public void draw(int x, int y, int wight, int height){
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + wight + ", height: " + height);
    }
}