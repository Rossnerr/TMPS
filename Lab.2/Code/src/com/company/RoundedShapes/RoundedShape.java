package com.company.RoundedShapes;

import com.company.Bridge.DrawAPI;

public abstract class RoundedShape {
    protected DrawAPI drawAPI;

    protected RoundedShape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();


}
