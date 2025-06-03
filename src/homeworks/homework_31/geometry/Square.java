package homeworks.homework_31.geometry;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = (side > 0) ? side : 0;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Square: a=%f, P=%f, S=%f", this.side, calculatePerimeter(), calculateArea());
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
