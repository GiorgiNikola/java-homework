package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println("\nCurrent radius: " + c.getRadius());
        System.out.println("Area of the circle: " + c.getArea());
        System.out.println("Length of the circle: " + c.getLength() + "\n");

        c.printPackageName();

        System.out.println("\nCurrent radius: " + c.getRadius());
        c.returnDoubleSizedCircle(c);
        System.out.println("Doubled radius " + c.getRadius());
        System.out.println("Area of the circle: " + c.getArea());
        System.out.println("Length of the circle: " + c.getLength());

        System.out.println("\nCurrent radius: " + c.getRadius());
        c.returnCustomSizedCircle(c, 3);
        System.out.println("Radius multiplied by three: " + c.getRadius());
        System.out.println("Area of the circle: " + c.getArea());
        System.out.println("Length of the circle: " + c.getLength());


        System.out.println("\nThe circle c is - " + (c.validateCircle(c) ? "Valid" : "Invalid"));
        Circle c1 = new Circle(-5);
        System.out.println("The circle c1 is - " + (c.validateCircle(c1) ? "Valid" : "Invalid"));
    }
}
