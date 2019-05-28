package org.itstep.model;

public class Triangle extends AbstractShape {
    private double base;
    private double height;

    public double getSide() {
        return base;
    }

    public void setSide(double side) {
        this.base = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height/2;
    }
}
