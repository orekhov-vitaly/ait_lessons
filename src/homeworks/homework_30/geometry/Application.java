package homeworks.homework_30.geometry;

public class Application {
    public static void main(String[] args) {
        Figure circle1 = new Circle(5.0);
        Figure square1 = new Square(12.5);
        Figure triangle1 = new Triangle(5, 8, 10);

        Figure[] figures = new Figure[3];
        figures[0] = circle1;
        figures[1] = square1;
        figures[2] = triangle1;

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].calculateArea());
        }
    }
}
