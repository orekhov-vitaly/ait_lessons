package homeworks.homework_31.geometry;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: a=%f, b=%f, P=%f, S=%f\n", this.sideA, this.sideB, calculatePerimeter(),
                calculateArea());
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA * sideB);
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
