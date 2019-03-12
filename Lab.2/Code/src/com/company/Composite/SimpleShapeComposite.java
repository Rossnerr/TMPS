package com.company.Composite;

import com.company.SimpleShapes.SimpleShape;

import java.util.ArrayList;
import java.util.List;

public class SimpleShapeComposite {
    private String name;
    private List<SimpleShape> simpleSimpleShapes;

    public SimpleShapeComposite(String name){
        this.name = name;
        simpleSimpleShapes = new ArrayList<SimpleShape>();
    }

    public void addSimpleShape (SimpleShape ss){
        simpleSimpleShapes.add(ss);
    }

    public void removeSimpleShapes (SimpleShape ss){
        simpleSimpleShapes.remove(ss);
    }

    public List<SimpleShape> getSimpleSimpleShapes(){
        return simpleSimpleShapes;
    }

    public String toString(){
        return ("Simple Shape : " + name);
    }
}
