package pl.javastart.task;

class ShapeCalculator {

    public double calculateSquareArea(Square square) {
        return Math.pow(square.getSide(), 2);
    }

    public double calculateSquarePerimeter(Square square) {
        return 4 * square.getSide();
    }

    public double calculateRectArea(Rectangle rectangle) {
        return rectangle.getSide1() * rectangle.getSide2();
    }

    public double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getSide1() + rectangle.getSide2());
    }

    public double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public double calculateCirclePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public double calculateTriangleArea(Triangle triangle) {
        double a = triangle.getSide1();
        double b = triangle.getSide2();
        double c = triangle.getSide3();
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
    }
}
