package ge.tbc.testautomation.generics;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo){
        Class<?> one = objOne.getClass();
        Class<?> two = objTwo.getClass();
        Field[] fieldsOne = one.getDeclaredFields();
        Field[] fieldsTwo = two.getDeclaredFields();
        return new AnyPair<>(fieldsOne, fieldsTwo);
    }

    public static void main(String[] args) {
        AnyPair<Field[], Field[]> anyPair = getDeclaredFields(Integer.valueOf(10), new String("Ten"));
        List<Field> elementOneFields = Arrays.asList(anyPair.getElementOne());
        List<Field> elementTwoFields = Arrays.asList(anyPair.getElementTwo());

        System.out.println("Fields of Integer class:");
        elementOneFields.forEach(System.out::println);
        System.out.println("\nFields of String class:");
        elementTwoFields.forEach(System.out::println);

        Circle c = new Circle(10);
        Rectangle r = new Rectangle(20,25);
        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(c, r);
        System.out.println("\nFigurePair:");
        System.out.println(figurePair);
    }
}
