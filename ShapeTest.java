abstract class Shape {
    abstract double getArea();
    abstract void printType();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void printType() {
        System.out.println("This is a Circle");
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    void printType() {
        System.out.println("This is a Rectangle");
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return 0.5 * base * height;
    }

    void printType() {
        System.out.println("This is a Triangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);

        circle.printType();
        System.out.println("Area: " + circle.getArea());

        rectangle.printType();
        System.out.println("Area: " + rectangle.getArea());

        triangle.printType();
        System.out.println("Area: " + triangle.getArea());
    }
}
