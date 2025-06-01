package homeworks.homework_31.geometry;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = (radius > 0) ? radius : 0;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: R=%f, P=%f, S=%f", this.radius, calculatePerimeter(), calculateArea());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
