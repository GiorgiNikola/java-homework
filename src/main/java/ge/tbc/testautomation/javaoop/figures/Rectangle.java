package ge.tbc.testautomation.javaoop.figures;

import java.util.Comparator;

public class Rectangle extends Figure{
    double a;
    double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double getArea() {
        return a * b;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public void printPackageName() {

    }


    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
