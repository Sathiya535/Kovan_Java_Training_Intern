package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;

// Parent class
abstract class Shape {
    abstract double area();
}

// Child class Circle
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Child class Square
class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

// Main class
public class ShapeFactory {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(3),
                new Square(4),
                new Circle(2)
        };

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area(); // Polymorphism
        }

        System.out.printf("Total Area = %.4f " , totalArea);
    }
}

