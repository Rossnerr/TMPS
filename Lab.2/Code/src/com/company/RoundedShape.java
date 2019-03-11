package com.company;

public abstract class RoundedShape {
    protected DrawAPI drawAPI;

    protected RoundedShape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
