package com.company;

public abstract class SimpleShapeDecorator implements SimpleShape {
    protected SimpleShape decoratedSimpleShape;

    public SimpleShapeDecorator(SimpleShape decoratedSimpleShape){
        this.decoratedSimpleShape = decoratedSimpleShape;
    }

    public void draw(int x, int y, int z, int j){
        decoratedSimpleShape.draw(x, y, z, j);
    }
}
