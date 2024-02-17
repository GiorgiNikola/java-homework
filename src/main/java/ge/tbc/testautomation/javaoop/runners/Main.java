package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
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
    }
}
