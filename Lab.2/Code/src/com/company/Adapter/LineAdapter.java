package com.company.Adapter;

import com.company.SimpleShapes.SimpleShape;

public class LineAdapter implements SimpleShape {
    private SimpleShape adaptee;

    public LineAdapter(SimpleShape line){
        this.adaptee = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2){
        adaptee.draw(x1, y1, x2, y2);
    }

    public String toString(){
        return("Line");
    }
}