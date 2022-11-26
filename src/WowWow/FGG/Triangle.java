package WowWow.FGG;

public class Triangle extends Figure{

    double lengthA;
    double lengthB;
    double lengthC;

    public Triangle(double a,double b, double c,String color) {
        super(color);
         lengthA=a;
         lengthB=b;
         lengthC=c;
    }

    @Override
    public double area() {
        double pp=perimeter()/2;
        double a= Math.sqrt(pp*(pp-lengthA)*(pp-lengthB)*(pp-lengthC));
        return a;
    }

    @Override
    public double perimeter() {
        double p = lengthA+lengthB+lengthC;
        return p;
    }
}
