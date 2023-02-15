package pl.javastart.task;

class Square {
    private double side;

    Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public String getSquareInfo() {
        return "Kwadrat o boku " + side + ":\n"
                + "Pole: " + calculateArea() + "\n"
                + "Obwód: " + calculatePerimeter();
    }
}
