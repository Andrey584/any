package daynine1;

public class Triangle extends Figure {
private double lenght1;
private double lenght2;
private double lenght3;
    public Triangle(String color, double lenght1, double lenght2, double lenght3) {
        super(color);
        this.lenght1 = lenght1;
        this.lenght2 = lenght2;
        this.lenght3 = lenght3;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - lenght1) * (halfP - lenght2) * (halfP - lenght3));
    }

    @Override
    public double perimeter() {
        return lenght1 + lenght2 + lenght3;
    }
}
