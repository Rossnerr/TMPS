package com.company;

import com.company.Composite.RoundedShape;
import com.company.Composite.SimpleShape;

public class Main {

    public static void main(String[] args) {
        RoundedShape roundedShape = new RoundedShape("Rounded Shape");
        SimpleShape simpleShape = new SimpleShape("Simple Shape");

//        RoundedShape circle = new RoundedShape("Circle");
//        RoundedShape ellipse = new RoundedShape("Elippse");
//        SimpleShape square = new SimpleShape("Square");
//        SimpleShape rectangle = new SimpleShape("Rectangle");
//
//        roundedShape.addRoundedShape(circle);
//        roundedShape.addRoundedShape(ellipse);
//        simpleShape.addSimpleShape(square);
//        simpleShape.addSimpleShape(rectangle);
//


        RectangleAdapter rectangle = new RectangleAdapter(new Rectangle());
        LineAdapter line = new LineAdapter(new Line());

        int x1 = 10, y1 = 10;
        int x2 = 30, y2 = 30;

        rectangle.draw(x1, y1, x2, y2);
        line.draw(x1, y1, x2, y2);

        simpleShape.addSimpleShape(rectangle);
        simpleShape.addSimpleShape(line);

        System.out.println(roundedShape);
        System.out.println(simpleShape);

//        for(RoundedShape rs : roundedShape.getRoundedShapes()){
//            System.out.println(rs);
//        }

        for(Shape ss : simpleShape.getSimpleShapes()){
            System.out.println(ss);
        }

    }
}
