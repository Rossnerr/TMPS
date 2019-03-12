package com.company;

import com.company.Adapter.LineAdapter;
import com.company.Adapter.RectangleAdapter;
import com.company.Bridge.RedCircle;
import com.company.Composite.RoundedShapeComposite;
import com.company.Composite.SimpleShapeComposite;
import com.company.Decorator.RedSimpleShapeDecorator;
import com.company.Flyweight.CircleFactory;
import com.company.RoundedShapes.RoundedShape;
import com.company.SimpleShapes.Line;
import com.company.SimpleShapes.Rectangle;
import com.company.SimpleShapes.SimpleShape;

public class Main {

    public static void main(String[] args) {
        int x1 = 10, y1 = 10; //first point
        int x2 = 30, y2 = 30; //second point

        RoundedShapeComposite roundedShapeComposite = new RoundedShapeComposite("Rounded ShapeComposite");
        SimpleShapeComposite simpleShapeComposite = new SimpleShapeComposite("Simple ShapeComposite");

        RectangleAdapter rectangle = new RectangleAdapter(new Rectangle());
        RectangleAdapter redRectangle = new RectangleAdapter(new RedSimpleShapeDecorator(new Rectangle()));

        LineAdapter line = new LineAdapter(new Line());
        LineAdapter redLine = new LineAdapter(new RedSimpleShapeDecorator(new Line()));

        rectangle.draw(x1, y1, x2, y2);
        System.out.println("----------------------------------");

        redRectangle.draw(x1, y1, x2, y2);
        System.out.println("----------------------------------");

        line.draw(x1, y1, x2, y2);
        System.out.println("----------------------------------");

        redLine.draw(x1, y1, x2, y2);
        System.out.println("----------------------------------");

        RoundedShape circle1Radius2 = CircleFactory.getCircle(2, new RedCircle());
        circle1Radius2.draw();

        System.out.println("----------------------------------");

        RoundedShape circle2Radius2 = CircleFactory.getCircle(2, new RedCircle());
        circle2Radius2.draw();

        System.out.println("----------------------------------");

        RoundedShape circleRadius4 = CircleFactory.getCircle(4, new RedCircle());
        circleRadius4.draw();

        System.out.println("----------------------------------");

        simpleShapeComposite.addSimpleShape(rectangle);
        simpleShapeComposite.addSimpleShape(redRectangle);

        simpleShapeComposite.addSimpleShape(line);
        simpleShapeComposite.addSimpleShape(redLine);

        roundedShapeComposite.addRoundedShape(circle1Radius2);
        roundedShapeComposite.addRoundedShape(circle2Radius2);
        roundedShapeComposite.addRoundedShape(circleRadius4);

        System.out.println(roundedShapeComposite);
        System.out.println(simpleShapeComposite);

        for(SimpleShape ss : simpleShapeComposite.getSimpleSimpleShapes()){
            System.out.print("Simple ShapeComposite: ");
            System.out.println(ss);
        }

        System.out.println("-----------------------------------");

        for(RoundedShape rs : roundedShapeComposite.getRoundedSimpleShapes()){
            System.out.print("Rounded ShapeComposite: ");
            System.out.println(rs);
        }
    }
}