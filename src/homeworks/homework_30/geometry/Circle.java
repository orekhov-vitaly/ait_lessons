package homeworks.homework_30.geometry;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = (radius > 0) ? radius : 0;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
