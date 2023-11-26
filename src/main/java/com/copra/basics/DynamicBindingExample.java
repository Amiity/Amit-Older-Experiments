package com.copra.basics;

import java.util.ArrayList;
import java.util.List;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class DynamicBindingExample {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Triangle());

        for (Shape shape : shapes) {
            shape.draw(); // Calls the appropriate draw method at runtime
        }
    }
}

