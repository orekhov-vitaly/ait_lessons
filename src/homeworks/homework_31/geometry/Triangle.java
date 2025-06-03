package homeworks.homework_31.geometry;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = (sideA > 0) ? sideA : 0;
        this.sideB = (sideB > 0) ? sideB : 0;
        this.sideC = (sideC > 0 && sideC <= (sideA + sideB)) ? sideC : 0;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        double resalt = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return resalt;
    }

    @Override
    public String toString() {
        return String.format("Triangle: a=%f, b=%f, c=%f, P=%f, S=%f", this.sideA, this.sideB, this.sideC,
                calculatePerimeter(), calculateArea());
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public boolean setSides(double sideA, double sideB, double sideC) {
        if (sideA < 0 || sideB < 0 || sideC < 0) return false;
        this.sideA = sideA;
        this.sideB = sideB;
        if (sideC <= (sideA + sideB)) {
            this.sideC = sideC;
        } else {
            return false;
        }
        return true;
    }
}
