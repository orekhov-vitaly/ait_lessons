package homeworks.homework_31.geometry;

public class Application {
    public static void main(String[] args) {
        Shape circle1 = new Circle(5.0);
        Shape square1 = new Square(12.5);
        Shape rectangle1 = new Rectangle(12, 8);
        Shape triangle1 = new Triangle(5, 8, 10);

        Shape[] shapes = new Shape[4];
        shapes[0] = circle1;
        shapes[1] = square1;
        shapes[2] = rectangle1;
        shapes[3] = triangle1;

        double sumArea = 0;
        double sumPerimetr = 0;

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].calculateArea();
            double perimetr = shapes[i].calculatePerimeter();
            System.out.println(shapes[i].toString());
            sumArea += area;
            sumPerimetr += perimetr;
        }

        System.out.printf("Sum areas: %.2f", sumArea);
        System.out.printf("Sum perimeters: %.2f", sumPerimetr);

//        CircleSingleTone single = CircleSingleTone.getInstance();
    }
}
