package com.company.Composite;

import com.company.Shape;

import java.util.ArrayList;
import java.util.List;

public class SimpleShape{
    private String name;
    private List<Shape> simpleShapes;

    public SimpleShape(String name){
        this.name = name;
        simpleShapes = new ArrayList<Shape>();
    }

    public void addSimpleShape (Shape ss){
        simpleShapes.add(ss);
    }

    public void removeSimpleShapes (Shape ss){
        simpleShapes.remove(ss);
    }

    public List<Shape> getSimpleShapes(){
        return simpleShapes;
    }

    public String toString(){
        return ("Simple Shape : " + name);
    }
}
