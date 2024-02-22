package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.rmi.server.UID;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Circle c1 = new Circle(random.nextDouble(50));
        System.out.println(Circle.numberOfCircleInstances);
        Circle c2 = new Circle(random.nextDouble(50));
        System.out.println(Circle.numberOfCircleInstances);
        Circle c3 = new Circle(random.nextDouble(50));
        System.out.println(Circle.numberOfCircleInstances);
        Circle c4 = new Circle(random.nextDouble(50));
        System.out.println(Circle.numberOfCircleInstances);
        Circle c5 = new Circle(random.nextDouble(50));
        System.out.println(Circle.numberOfCircleInstances);

        String s1 = Util.circleToString(c1);
        String s2 = Util.circleToString(c2);
        String s3 = Util.circleToString(c3);
        String s4 = Util.circleToString(c4);
        String s5 = Util.circleToString(c5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        System.out.println();

        Rectangle r1 = new Rectangle(10,20);
        System.out.println("Area of first Rectangle: " + r1.getArea());
        System.out.println("Perimeter of first Rectangle: " + r1.getPerimeter() + "\n");

        Rectangle r2 = new Rectangle(50,80);
        System.out.println("Area of second Rectangle: " + r2.getArea());
        System.out.println("Perimeter of second Rectangle: " + r2.getPerimeter() + "\n");

        HelperFunctions.compareRectangles(r1, r2); // Bonus Task
        System.out.println();

        Triangle t1 = new Triangle(3,7,9, 5);
        System.out.println("Area of first Triangle: " + t1.getArea());
        System.out.println("Perimeter of first Triangle: " + t1.getPerimeter()+ "\n");

        Triangle t2 = new Triangle(7,10,12, 8);
        System.out.println("Area of second Triangle: " + t2.getArea());
        System.out.println("Perimeter of second Triangle: " + t2.getPerimeter());
    }
}
