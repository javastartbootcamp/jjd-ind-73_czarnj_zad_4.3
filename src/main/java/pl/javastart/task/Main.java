package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Square square = new Square(3);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2, 3);
        Triangle triangle = new Triangle(2, 2, 3);

        System.out.println("Area of square: " + shapeCalculator.calculateSquareArea(square));
        System.out.println("Area of circle: " + shapeCalculator.calculateCircleArea(circle));
        System.out.println("Perimeter of triangle: " + shapeCalculator.calculateTrianglePerimeter(triangle));
        System.out.println("Area of square: " + shapeCalculator.calculateRectanglePerimeter(rectangle));
    }
}
