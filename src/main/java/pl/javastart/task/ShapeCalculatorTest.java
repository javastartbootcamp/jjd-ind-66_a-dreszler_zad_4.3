package pl.javastart.task;

public class ShapeCalculatorTest {

    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(square.getSquareInfo());
        System.out.println();
        System.out.println(rectangle.getRectInfo());
        System.out.println();
        System.out.println(circle.getCircleInfo());
        System.out.println();
        System.out.println(triangle.getTriangleInfo());
    }
}
