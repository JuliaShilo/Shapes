package org.itstep;

import org.itstep.Service.ListService;
import org.itstep.model.Circle;
import org.itstep.model.Shape;
import org.itstep.model.Triangle;
import org.itstep.model.Square;

import java.sql.SQLOutput;
import java.util.*;

public class ApplicationRunner {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.setRadius(10);
//        System.out.println("Circle has radius " + circle.getRadius ());
//        System.out.println("Circle has area " + circle.getArea ());
//
//
//        Square square1 = new Square();
//        square1.setSide(5.0);
//        Square square2 = new Square(10.0);
//        System.out.println("Square 1 has side " + square1.getSide ());
//        System.out.println("Square 1 has area " + square1.getArea ());
//        System.out.println("Square 2 has side " + square2.getSide ());
//        System.out.println("Square 2 has area " + square2.getArea ());
//
//
//        Triangle triangle = new Triangle ();
//        triangle.setBase(7.0);
//        triangle.setHeight (6.0);
//        System.out.println("Triangle has base " + triangle.getBase());
//        System.out.println("Triangle has height " + triangle.getHeight());
//        System.out.println("Triangle has area " + triangle.getArea());


//        String str = "str1";
//        String[] strings = new String[3];
//        strings [0] = str;
//        strings [1] = "str2";
//        strings [2] = "str3";
//
//        System.out.println(strings [0]);

        Circle circle = new Circle (15);
        Triangle triangle = new Triangle (10, 8);
        Square square = new Square (18);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add (circle);
        shapeList.add (triangle);
        shapeList.add (square);
        shapeList.add (circle);

     Shape maxShape = ListService.getMaxShape (shapeList);
     if (maxShape != null){
         System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea());

     }





    }
}
