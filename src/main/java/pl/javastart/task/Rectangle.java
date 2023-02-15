package pl.javastart.task;

class Rectangle {
    private double side1;
    private double side2;

    Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
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

    public double calculateArea() {
        return side1 * side2;
    }

    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

    public String getRectInfo() {
        return "Prostokąt o bokach " + side1 + ", " + side2 + ":\n"
                + "Pole: " + calculateArea() + "\n"
                + "Obwód: " + calculatePerimeter();
    }
}
