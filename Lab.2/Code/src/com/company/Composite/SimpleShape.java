package com.company.Composite;

import java.util.ArrayList;
import java.util.List;

public class SimpleShape{
    private String name;
    private List<com.company.SimpleShape> simpleSimpleShapes;

    public SimpleShape(String name){
        this.name = name;
        simpleSimpleShapes = new ArrayList<com.company.SimpleShape>();
    }

    public void addSimpleShape (com.company.SimpleShape ss){
        simpleSimpleShapes.add(ss);
    }

    public void removeSimpleShapes (com.company.SimpleShape ss){
        simpleSimpleShapes.remove(ss);
    }

    public List<com.company.SimpleShape> getSimpleSimpleShapes(){
        return simpleSimpleShapes;
    }

    public String toString(){
        return ("Simple SimpleShape : " + name);
    }
}
