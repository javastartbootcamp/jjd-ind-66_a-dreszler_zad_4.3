package pl.javastart.task;

public class ShapeCalculatorTest {

    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println(
                "Kwadrat o boku " + square.getSide() + ":\n"
                + "Pole: " + shapeCalculator.calculateSquareArea(square) + "\n"
                + "Obwód: " + shapeCalculator.calculateSquarePerimeter(square));
        System.out.println();
        System.out.println(
                "Prostokąt o bokach " + rectangle.getSide1() + ", " + rectangle.getSide2() + ":\n"
                + "Pole: " + shapeCalculator.calculateRectArea(rectangle) + "\n"
                + "Obwód: " + shapeCalculator.calculateRectPerimeter(rectangle));
        System.out.println();
        System.out.println(
                "Koło o promieniu " + circle.getRadius() + ":\n"
                + "Pole: " + shapeCalculator.calculateCircleArea(circle) + "\n"
                + "Obwód: " + shapeCalculator.calculateCirclePerimeter(circle));
        System.out.println();
        System.out.println(
                "Trójkąt o bokach " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3() + ":\n"
                + "Pole: " + shapeCalculator.calculateTriangleArea(triangle) + "\n"
                + "Obwód: " + shapeCalculator.calculateTrianglePerimeter(triangle));
    }
}
