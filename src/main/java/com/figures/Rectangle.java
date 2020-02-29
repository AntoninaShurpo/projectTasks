package com.figures;

class Rectangle implements IFigure {
    protected int width, height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}