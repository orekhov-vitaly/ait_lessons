package homeworks.homework_36.task_2;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (checkValue(length)) {
            this.length = length;
        } else {
            this.length = 1;
        }

        if (checkValue(width)) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    private boolean checkValue(double val) {
        if (val > 0) return true;
        return false;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (checkValue(width)) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (checkValue(length)) {
            this.length = length;
        } else {
            this.length = 1;
        }
    }

    @Override
    public String toString() {
        return "Прямоугольник [длина=" + length + ", ширина=" + width + "]";
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(length);
        result = 31 * result + Double.hashCode(width);
        return result;
    }
}
