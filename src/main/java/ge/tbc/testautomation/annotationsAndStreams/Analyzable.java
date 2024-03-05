package ge.tbc.testautomation.annotationsAndStreams;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings({"unused"})
public class Analyzable {
    @VariableNameAnnotation(name = "StringVariable")
    private String stringVariable;

    @VariableNameAnnotation(name = "IntegerVariable")
    private int integerVariable;

    @VariableNameAnnotation(name = "DoubleVariable")
    private double doubleVariable;

    @VariableNameAnnotation(name = "BooleanVariable")
    private boolean booleanVariable;

    @VariableNameAnnotation(name = "CharVariable")
    private char charVariable;

    @VariableNameAnnotation(name = "ArrayVariable")
    private int[] arrayVariable;

    @VariableNameAnnotation(name = "ObjectVariable")
    private Object objectVariable;

    @VariableNameAnnotation(name = "FloatVariable")
    private float floatVariable;

    @VariableNameAnnotation(name = "LongVariable")
    private long longVariable;

    @VariableNameAnnotation(name = "ShortVariable")
    private short shortVariable;

    @VariableNameAnnotation(name = "ByteVariable")
    private byte byteVariable;

    @VariableNameAnnotation(name = "NonMatchingName") // This doesn't match the variable name
    private String anotherStringVariable;

    @VariableNameAnnotation() // This doesn't match the variable name
    private Rectangle rectangleVariable;

    public static void main(String[] args) {
        Analyzable analyzable = new Analyzable();
        Class<? extends Analyzable> one = analyzable.getClass();
        List<Field> matchingNameFields = Arrays.stream(one.getDeclaredFields())
                .filter(f -> {
                    VariableNameAnnotation annotation = f.getAnnotation(VariableNameAnnotation.class);
                    return annotation != null && f.getName().equalsIgnoreCase(annotation.name());
                }).toList();

        List<Field> nonMatchingNameFields = Arrays.stream(one.getDeclaredFields())
                .filter(f -> {
                    VariableNameAnnotation annotation = f.getAnnotation(VariableNameAnnotation.class);
                    return annotation != null && !f.getName().equalsIgnoreCase(annotation.name());
                }).toList();

        System.out.println("\nMatching name fields: ");
        matchingNameFields.forEach(str -> System.out.println(str.getName())); // for testing
        System.out.println("\nNon-Matching name fields: ");
        nonMatchingNameFields.forEach(str -> System.out.println(str.getName())); // for testing

        // Creating unused variables
        int unusedIntVariable;
        double unusedDoubleVariable;
        String unusedStringVariable;
        boolean unusedBooleanVariable;
    }
}
