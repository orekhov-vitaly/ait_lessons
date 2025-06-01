package homeworks.homework_31.geometry;

public class Application {
    public static void main(String[] args) {
        Shape circle1 = new Circle(5.0);
        Shape square1 = new Square(12.5);
        Shape triangle1 = new Triangle(5, 8, 10);

        Shape[] shapes = new Shape[3];
        shapes[0] = circle1;
        shapes[1] = square1;
        shapes[2] = triangle1;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }
}
