package homeworks.homework_30.geometry;

public class Square extends Figure{
    private double side;

    public Square(double side) {
        this.side = (side > 0) ? side : 0;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
