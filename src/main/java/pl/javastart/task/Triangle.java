package pl.javastart.task;

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double calculateArea() {
        double a = side1;
        double b = side2;
        double c = side3;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public String getTriangleInfo() {
        return "Trójkąt o bokach " + side1 + ", " + side2 + ", " + side3 + ":\n"
                + "Pole: " + calculateArea() + "\n"
                + "Obwód: " + calculatePerimeter();
    }
}
