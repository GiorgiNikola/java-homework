package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.rmi.server.UID;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(-5);
        }catch (RadiusException e){
            System.out.println("\n" + e.getMessage());
        }
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3);
        Circle c4 = new Circle(4);
        Circle c5 = new Circle(5);
        try {
            Circle c6 = new Circle(6);
        }catch (LimitException e){
            System.out.println("\n" + e.getMessage());
        }

        String str = "Test Automation Bootcamp 6, 2022";
        System.out.println("\nWord 'Automation' in lowercase: " + str.substring(5,15).toLowerCase());
        String[] strings = str.split(" ");
        System.out.println("\nEach word on a separate line:");
        for (String s : strings){
            System.out.println(s);
        }
        System.out.println("\nLength of this sentence: " + str.length());
        System.out.println("\nSentence with replaced spaces: " + str.replace(" ", "-"));
        System.out.println();
        String[] phoneNumbers = {
                "599-123-456-123",       // invalid
                "595987654",       // Valid
                "592234567",       // Valid
                "555876543",       // Valid
                "123456789",       // Invalid
                "59512345",        // Invalid
                "555-123-456",     // valid
        };

        Arrays.stream(phoneNumbers)
                .forEach(phoneNumber -> {
                    boolean isValid = phoneNumberValidation(phoneNumber);
                    System.out.println(phoneNumber + " - " + (isValid ? "Valid" : "Invalid"));
                });
    }

    private static boolean phoneNumberValidation(String phoneNumber){
        return phoneNumber.replace("-","").matches("^(555|595|592|599)\\d{6}$");
    }
}
