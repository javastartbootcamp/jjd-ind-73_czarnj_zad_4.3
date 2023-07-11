package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(3);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(2, 2, 3);

        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
        System.out.println("Area of square: " + rectangle.calculatePerimeter());
    }
}
