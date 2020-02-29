package com.figures;

class Runner {
    public static void main(String[] args) {
        IFigure figure = new Rectangle(2, 10);
        print(figure);
        figure = new Triangle(3, 4,5);
        print(figure);
        figure = new Circle(2);
        print(figure);
        figure = new Square(5);
        print(figure);

    }

    private static void print(IFigure figure) {
        System.out.println("The area of " + figure.getClass().getName() + " is " + figure.area());
    }
}









