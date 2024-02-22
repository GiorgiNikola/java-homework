package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles(Rectangle a, Rectangle b){
        if (a.getPerimeter() > b.getPerimeter()) System.out.println("parameter 1 > parameter 2");
        else if (a.getPerimeter() < b.getPerimeter()) System.out.println("parameter 1 < parameter 2");
        else System.out.println("parameter 1 = parameter 2");
    }
}
