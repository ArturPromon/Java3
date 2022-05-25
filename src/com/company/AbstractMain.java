package com.company;

public class AbstractMain {
    public static void main(String[] args){
        ShapeAbstract circle = new Circle2();
        ShapeAbstract square = new Square2();
        ShapeAbstract triangle = new Trinagle2();

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
