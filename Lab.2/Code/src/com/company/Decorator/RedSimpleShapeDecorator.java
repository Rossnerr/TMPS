package com.company.Decorator;

import com.company.SimpleShapes.SimpleShape;

public class RedSimpleShapeDecorator extends SimpleShapeDecorator {
    public RedSimpleShapeDecorator(SimpleShape decoratedSimpleShape){
        super(decoratedSimpleShape);
    }

    @Override
    public void draw(int x, int y, int z, int j){
        decoratedSimpleShape.draw(x, y, z, j);
        setRedBorder(decoratedSimpleShape);
    }

    private void setRedBorder(SimpleShape decoratedSimpleShape){
        System.out.println("Color: Red");
    }
}
