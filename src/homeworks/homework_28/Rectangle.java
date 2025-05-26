package homeworks.homework_28;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public void displayInfo() {
        System.out.println("Name: " + super.getName() + "\nColor: " + super.getColor());
        System.out.println("a = " + this.width + ", b = " + this.height);
    }
}
