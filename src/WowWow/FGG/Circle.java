package WowWow.FGG;

public class Circle extends Figure{

    double radiusCircle;

    public Circle(double radiusCircle,String color) {
        super(color);
        this.radiusCircle=radiusCircle;
    }

    @Override
    public double area() {
        double s=Math.pow(radiusCircle,2)*Math.PI;
        return s;
    }

    @Override
    public double perimeter() {
        double p=2*radiusCircle*Math.PI;
        return p;
    }
}
