import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(add(2, 3));
        System.out.println(subtract(10, 5));
        System.out.println(multiply(6, 9));
        System.out.println(divide(20, 4));

//        System.out.println("Enter a Number Between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int userInput = getInteger(1, 10, scanner) ;
        calcFactorial(userInput);

        numberOfDice(scanner);
    }
    //Create four separate methods. Each will perform an arithmetic operation:
    //Addition
    //Subtraction
    //Multiplication
    //Division
    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //Test your methods and verify the output.
    //Add a modulus method that finds the modulus of two numbers.

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
    // ==============================================================================================================

    //Create a method that validates that user input is in a certain range
    //The method signature should look like this:
    /*
    public static int getInteger(int min, int max);
    ** and used like this:
    System.out.print("Enter a number between 1 and 10: ");
    int userInput = getInteger(1, 10);
     */
    public static void promptUser() {
        System.out.println("Enter a Number Between 1 and 10");
    }

    //refactor scanner as an argument
    public static int getInteger(int min, int max, Scanner scanner) {
        System.out.printf("Enter a Number Between %s and %s\n", min, max);
        int userEntered = scanner.nextInt();
        if (userEntered >= min && userEntered <= max) {
            System.out.println("Number is in Range");
        } else {
            System.out.println("Number is not in Range try again");
            userEntered = getInteger(min, max, scanner);
        }
        return userEntered;
    }
    // ==============================================================================================================
    //**3. Calculate the factorial of a number
    //Prompt the user to enter an integer from 1 to 10.
    //Display the factorial of the number entered by the user.
    //Ask if the user wants to continue.
    //Use a for loop to calculate the factorial.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //Use the long type to store the factorial.
    //Continue only if the user agrees to.
    //A factorial is a number multiplied by each of the numbers before it.
    //Factorials are denoted by the exclamation point (n!). Ex:
    /*
        1! = 1               = 1
        2! = 1 x 2           = 2
        3! = 1 x 2 x 3       = 6
        4! = 1 x 2 x 3 x 4   = 24
     */
    public static void calcFactorial(int typedNumber) {
        String factorialContainer = "";
        int total = 1;
        String currentFactorial = String.valueOf(1);
        int counter = typedNumber;

        for (int i = 1; i <= typedNumber; i++) {
            total = total * i;
            if (i == 1) {
                factorialContainer = whiteSpace(counter);
                System.out.printf("%s! = %s   %s  = %s\n", i, currentFactorial, factorialContainer, total);
            } else if (i == 10) {
                currentFactorial += " x " + i;
                factorialContainer = whiteSpace(counter);
                System.out.printf("%s! = %s%s= %s\n", i, currentFactorial, factorialContainer, total);
                break;
            } else {
                currentFactorial = currentFactorial + " x " + i;
                factorialContainer = whiteSpace(counter);
                counter--;
                System.out.printf("%s! = %s%s  = %s\n", i, currentFactorial, factorialContainer, total);
            }

        }
    }

    public static String whiteSpace(int counter) {
        String spaceHolder = "    ";
        for (int i = 1; i <= counter; i++){
            spaceHolder += "    ";
        }
        return spaceHolder;
    }


    //======================================================================================================
    // *** 4. Create an application that simulates dice rolling ***
    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.

    public static void numberOfDice (Scanner scanner){
        System.out.println("Enter Number of Sides for Dice:");
        int diceNumber = scanner.nextInt(); //Will ask a user to type in a number for dice
        scanner.nextLine(); // for formatting purposes
        rollTheDice(diceNumber, scanner); // method is initiated to begin dice rolling process

    }
    //Method checks 'response' and compares it to conditional and returns the appropriate boolean
    public static boolean checkAnswer (String response, int diceNumber, Scanner scanner){
        boolean result;
        if(response.equalsIgnoreCase("Y")){ //if 'y' then true
            System.out.println("You selected Yes");
            result = true;
        } else if (response.equalsIgnoreCase("N")){ //if 'n' then false
            System.out.println("You selected No");
            result = false;
        } else { //Anything other than 'y' and 'n' will recursively ask the question again
            System.out.println("Not a Valid Response");
            result = false;
            checkAnswer(response, diceNumber, scanner);
        }
        return result;
    }

    public static String rollTheDice (int diceNumber, Scanner scanner){
        String diceRoll1, diceRoll2, finalResult; //initialize some variables

        System.out.println("Roll The Dice? Y/N");
        String checkResponse = scanner.nextLine(); //Prompt user to type y/n to roll dice
        boolean response = checkAnswer(checkResponse, diceNumber, scanner); //response is sent to method that returns boolean based on answer
        if (response){ //If response is true or "y" it will perform 2 dice rolls and stored them in respected variable, then both vars are stored in finalResult for Display
            diceRoll1 = String.format("Rolled Dice One and Got: %s", diceRolled(diceNumber));
            diceRoll2 = String.format("Rolled Dice Two and Got: %s", diceRolled(diceNumber));
            finalResult = String.format("%s\n%s",diceRoll1, diceRoll2 );
        } else { //If response is false or 'n' it will just set finalResult to this string and end the method
            finalResult = "Ok understandable, have a nice day";
        }
        System.out.println(finalResult);

        if (response){ //If response earlier was true  then will prompt user if they want to play again
            System.out.println("Do you want to Play again? Y/N");
            checkResponse = scanner.nextLine(); //stores string
            response = checkAnswer(checkResponse, diceNumber, scanner); // Calling function for another boolean value based on 'checkResponse'
            if (response){ //if response is true it will start entire dice cycle again
                numberOfDice(scanner);
            } else { //if response is false, it well just log and exit conditional
                System.out.println("Okay Have a Nice Day");
            }
        }
        return finalResult;
    }

    public static int diceRolled (int diceNumber){ //Return random number between 1 and diceNumber selected
        return (int) Math.floor( (Math.random() * diceNumber) + 1);
    }
    //========================================================================================================================

}
