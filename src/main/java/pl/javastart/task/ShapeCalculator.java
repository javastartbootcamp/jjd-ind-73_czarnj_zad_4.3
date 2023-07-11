package pl.javastart.task;

public class ShapeCalculator {
    public double calculateSquareArea(Square square) {
        return Math.pow(square.getSide(), 2);
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }

    public double calculateRectanglePerimeter(Rectangle rectangle) {
        return 2 * rectangle.getSideA() + 2 * rectangle.getSideB();
    }
}
