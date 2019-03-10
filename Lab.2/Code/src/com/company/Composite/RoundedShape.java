package com.company.Composite;

import com.company.Shape;

import java.util.ArrayList;
import java.util.List;

public class RoundedShape{
    private String name;
    private List<Shape> roundedShapes;

    public RoundedShape(String name){
        this.name = name;
        roundedShapes = new ArrayList<Shape>();
    }

    public void addRoundedShape (Shape rs){
        roundedShapes.add(rs);
    }

    public void removeRoundedShape (Shape rs){
        roundedShapes.remove(rs);
    }

    public List<Shape> getRoundedShapes(){
        return roundedShapes;
    }

    public String toString(){
        return ("Rounded Shape : " + name);
    }
}
