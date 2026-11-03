// Question 1
abstract class Shape {
    final double PI = 3.14159;

    abstract void draw();

    final void displayType() {
        System.out.println("This is a 2D Shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        double area = PI * radius * radius;
        System.out.println("Drawing Circle with radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}

public class AbstractFinalDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.displayType();
        c.draw();
    }
}