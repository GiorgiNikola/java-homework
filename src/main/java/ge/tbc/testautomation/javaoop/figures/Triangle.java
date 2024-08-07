package ge.tbc.testautomation.javaoop.figures;

public class Triangle{
    double a;
    double b;
    double c;
    double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    public double getArea() {
        return b * h / 2;
    }


    public double getPerimeter() {
        return a + b + c;
    }
}
