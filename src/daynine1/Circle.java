package daynine1;

public class Circle extends Figure {
    private double rad;
    public Circle(String color, double rad){
        super(color);
        this.rad = rad;
    }

    @Override
    public double area() {
        return rad * rad * Math.PI;
    }

    @Override
    public double perimeter() {
        return (rad + rad ) * Math.PI;
    }
}
