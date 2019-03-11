package com.company.Composite;

import com.company.SimpleShape;

import java.util.ArrayList;
import java.util.List;

public class RoundedShape{
    private String name;
    private List<SimpleShape> roundedSimpleShapes;

    public RoundedShape(String name){
        this.name = name;
        roundedSimpleShapes = new ArrayList<SimpleShape>();
    }

    public void addRoundedShape (SimpleShape rs){
        roundedSimpleShapes.add(rs);
    }

    public void removeRoundedShape (SimpleShape rs){
        roundedSimpleShapes.remove(rs);
    }

    public List<SimpleShape> getRoundedSimpleShapes(){
        return roundedSimpleShapes;
    }

    public String toString(){
        return ("Rounded SimpleShape : " + name);
    }
}
