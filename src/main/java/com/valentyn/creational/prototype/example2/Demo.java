package com.valentyn.creational.prototype.example2;

import com.valentyn.creational.prototype.example2.shapes.Circle;
import com.valentyn.creational.prototype.example2.shapes.Rectangle;
import com.valentyn.creational.prototype.example2.shapes.Shape;

class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 10;
        circle.color = "green";
        circle.x = 3;
        circle.y = 4;

        Circle anotherCircle = (Circle) circle.clone();
        System.out.println(circle);
        System.out.println(anotherCircle);
        System.out.println(circle == anotherCircle);
        System.out.println(circle.equals(anotherCircle));

        Rectangle rectangle = new Rectangle();
        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        System.out.println(rectangle);
        System.out.println(anotherRectangle);
        System.out.println(rectangle == anotherRectangle);
        System.out.println(rectangle.equals(anotherRectangle));
    }
}
