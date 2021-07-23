package util;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private int minInt;
    private int maxInt;
    private double minDouble;
    private double maxDouble;

    public Input() {
        createScanner();
    }

    public void createScanner() {
        this.scanner = new Scanner(System.in);
    }

    public String userInput() {
        return scanner.nextLine();
    }

    public String getString() {
        return userInput();

    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = userInput();
        if (userInput.toUpperCase().startsWith("Y")) {
            return true;
        } else {
            return false;
        }
    }

    public void setMinMaxInt(int min, int max) {
        this.minInt = min;
        this.maxInt = max;
    }

    public void setMinMaxDouble(double min, double max) {
        this.minDouble = min;
        this.maxDouble = max;
    }

    public int getInt() { //replaced parameter with private fields that can only be set calling the setters
        int typedNumber = 0;
        System.out.printf("Type a Number Between %s and %s\n", minInt, maxInt);

        try {
            typedNumber = Integer.parseInt(getString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            throw new NumberFormatException("Not An Integer");
        }

//        typedNumber = Integer.parseInt(userInput());
        if (typedNumber < minInt || typedNumber > maxInt) {
            System.out.println("That is out of range");
            getInt();
        } else {
            System.out.println("You Typed: " + typedNumber);
            return typedNumber;
        }
        return typedNumber;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int typedNumber = 0;
        try {
            typedNumber = Integer.parseInt(getString());
            System.out.println(typedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Not Valid Input");
        }
        System.out.println("You Typed: " + typedNumber);
        return typedNumber;
    }

    public void getDouble() {
        System.out.printf("Type a Number Between %s and %s\n", minDouble, maxDouble);
        double typedNumber;
        try {
            typedNumber = Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            throw new NumberFormatException("Not a Valid Double");
        }
        if (typedNumber < minDouble || typedNumber > maxDouble) {
            System.out.println("That is out of range");
            getDouble();
        } else {
            System.out.println("You Typed: " + typedNumber);
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double typedNumber = Double.parseDouble(userInput());
        System.out.println("You Typed: " + typedNumber);
        return typedNumber;
    }


}
