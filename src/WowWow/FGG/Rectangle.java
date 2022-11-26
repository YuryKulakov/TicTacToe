package WowWow.FGG;

public class Rectangle extends Figure{

    double width;
    double height;

    public Rectangle(double width,double height,String color) {
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        double a=width*height;
        return a;
    }

    @Override
    public double perimeter() {
        double p =2*(width+height);
        return p;
    }
}
