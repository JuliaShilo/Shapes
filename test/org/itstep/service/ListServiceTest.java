package org.itstep.service;

import org.itstep.model.Circle;
import org.itstep.model.Shape;
import org.itstep.model.Square;
import org.itstep.model.Triangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListServiceTest {

    @Test
    void getMaxShape() {

        Circle circle = new Circle(5);
        Circle circle2 = new Circle(10);
        Triangle triangle = new Triangle(10, 8);
        Triangle triangle2 = new Triangle(11, 9);
        Square square = new Square(20);
        Square square2 = new Square(16);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(circle2);
        shapeList.add(triangle2);
        shapeList.add(square2);

        assertNotNull(shapeList);

        Shape maxShape = ListService.getMaxShape(shapeList);

        assertNotNull(maxShape);
        assertEquals(maxShape.getClass().getSimpleName(), "Square");
        assertEquals(maxShape.getArea(), 400);

    }


    @Test
    void checkEmptyList() {

        Shape nullShape = ListService.getMaxShape(new ArrayList<>());

        assertNull(nullShape);

    }

    @Test
    void getMinShape() {

        Circle circle = new Circle(5);
        Circle circle2 = new Circle(10);
        Triangle triangle = new Triangle(10, 8);
        Triangle triangle2 = new Triangle(11, 9);
        Square square = new Square(20);
        Square square2 = new Square(16);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(circle2);
        shapeList.add(triangle2);
        shapeList.add(square2);


        assertNotNull(shapeList);

        Shape minShape = ListService.getMinShape(shapeList);

        assertNotNull(minShape);
        assertEquals(minShape.getClass().getSimpleName(), "Triangle");
        assertEquals(minShape.getArea(), 40);

    }

    @Test
    void checkEmptyList2() {
        Shape nullShape = ListService.getMinShape(new ArrayList<>());

        assertNull(nullShape);
    }
}