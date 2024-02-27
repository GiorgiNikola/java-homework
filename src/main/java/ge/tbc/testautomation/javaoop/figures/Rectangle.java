package ge.tbc.testautomation.javaoop.figures;

public class Rectangle{
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double getArea() {
        return a * b;
    }


    public double getPerimeter() {
        return (a + b) * 2;
    }
}
