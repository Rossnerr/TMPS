package com.company.Composite;

import com.company.RoundedShapes.RoundedShape;

import java.util.ArrayList;
import java.util.List;

public class RoundedShapeComposite {
    private String name;
    private List<RoundedShape> roundedSimpleShapes;

    public RoundedShapeComposite(String name){
        this.name = name;
        roundedSimpleShapes = new ArrayList<RoundedShape>();
    }

    public void addRoundedShape (RoundedShape rs){
        roundedSimpleShapes.add(rs);
    }

    public void removeRoundedShape (RoundedShape rs){
        roundedSimpleShapes.remove(rs);
    }

    public List<RoundedShape> getRoundedSimpleShapes(){
        return roundedSimpleShapes;
    }

    public String toString(){
        return ("Rounded Shape : " + name);
    }
}
