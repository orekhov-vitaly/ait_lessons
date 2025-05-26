package homeworks.homework_28;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
     public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
     }

    public void displayInfo() {
        System.out.println("Name: " + super.getName() + "\nColor: " + super.getColor());
        System.out.println("R = " + this.radius);
    }
}
