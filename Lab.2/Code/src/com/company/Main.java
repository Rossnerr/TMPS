package com.company;

import com.company.Composite.RoundedShape;

public class Main {

    public static void main(String[] args) {
        RoundedShape roundedShape = new RoundedShape("Rounded SimpleShape");
        com.company.Composite.SimpleShape simpleShape = new com.company.Composite.SimpleShape("Simple SimpleShape");

//        RoundedShape circle = new RoundedShape("Circle");
//        RoundedShape ellipse = new RoundedShape("Elippse");
//        SimpleShape square = new SimpleShape("Square");
//        SimpleShape rectangle = new SimpleShape("Rectangle");
//
//        roundedShape.addRoundedShape(circle);
//        roundedShape.addRoundedShape(ellipse);
//        simpleShape.addSimpleShape(square);
//        simpleShape.addSimpleShape(rectangle);

        RectangleAdapter rectangle = new RectangleAdapter(new Rectangle());
        RectangleAdapter redRectangle = new RectangleAdapter(new RedSimpleShapeDecorator(new Rectangle()));

        LineAdapter line = new LineAdapter(new Line());
        LineAdapter redLine = new LineAdapter(new RedSimpleShapeDecorator(new Line()));

        com.company.RoundedShape redCircle = new Circle(10, 10, 2, new RedCircle());

        Circle circle = (Circle)CircleFactory.getCircle(10);
        Circle circle1 = (Circle) CircleFactory.getCircle(10);

        int x1 = 10, y1 = 10;
        int x2 = 30, y2 = 30;

        rectangle.draw(x1, y1, x2, y2);
        System.out.println("----------------------------------");

        redRectangle.draw(x1, y1, x2, y2);
        System.out.println("----------------------------------");

        line.draw(x1, y1, x2, y2);
        System.out.println("----------------------------------");

        redLine.draw(x1, y1, x2, y2);
        System.out.println("----------------------------------");

        simpleShape.addSimpleShape(rectangle);
        simpleShape.addSimpleShape(redRectangle);

        simpleShape.addSimpleShape(line);
        simpleShape.addSimpleShape(redLine);

        System.out.println(roundedShape);
        System.out.println(simpleShape);

//        for(RoundedShape rs : roundedShape.getRoundedSimpleShapes()){
//            System.out.println(rs);
//        }

        for(SimpleShape ss : simpleShape.getSimpleSimpleShapes()){
            System.out.print("Simple SimpleShape: ");
            System.out.println(ss);
        }

        System.out.println("-----------------------------------");

        redCircle.draw();
        circle.draw();
        circle1.draw();
    }
}
