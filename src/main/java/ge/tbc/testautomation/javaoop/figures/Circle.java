package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;

public class Circle extends Figure implements IResizableCircle, IValidCircle, Comparable<Circle> {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        Package pack = this.getClass().getPackage();
        if (pack != null){
            System.out.println("Package Name: " + pack.getName());
        }else {
            System.out.println("The class is not in package");
        }
    }

    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        circle.setRadius(circle.getRadius()*2);
        return circle;
    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {
        circle.setRadius(circle.getRadius()*byvValue);
        return circle;
    }

    @Override
    public boolean validateCircle(Circle circle) {
        return circle.getRadius() > 0;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius > o.getRadius()) return 1;
        else if (this.radius < o.getRadius()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
