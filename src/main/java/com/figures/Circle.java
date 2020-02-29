package com.figures;

class Circle implements IFigure {
    protected int r;
    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
