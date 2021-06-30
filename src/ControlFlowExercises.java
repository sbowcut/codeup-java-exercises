import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        short num = 0;
//
//        do {
//            System.out.println(num);
//            num += 2;
//        } while (num <= 100);

//        short num = 100;
//
//        do {
//            System.out.println(num);
//            num -= 5;
//        } while (num >= -10);


//        Had to change to long to reflect higher calculation surpassing integer max value
//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

        //-- For loop version of previous 2 exercises.

//        for (byte i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (byte i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (short num = 100; num >= -10; num -= 5) {
//            System.out.println(num);
//        }

//        for (long i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }


//        for (byte i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? ");
//
//        short userInput = Short.parseShort(sc.next());
//        System.out.println("\nHere is your table!\n");
//        System.out.println("number | squared | cubed\n------ | ------- | ------");
//        for (short i = 1; i <= userInput; i++) {
//            System.out.printf("%s      | %s       | %s\n", i, i * i, i * i * i);
//        }

        boolean continueProgram = true;

        while (continueProgram) {
            while (true) {
                byte userGrade = 0;
                System.out.println("What is your numerical grade? ");
                if (sc.hasNextByte()) {
                    userGrade = sc.nextByte();
                    if (userGrade < 0 || userGrade > 100) {
                        System.out.println("That is not a valid grade number");
                    } else if (userGrade < 59) {
                        System.out.println("Letter grade earned: F");
                        break;
                    } else if (userGrade == 60) {
                        System.out.println("Letter grade earned: D-");
                        break;
                    } else if (userGrade > 60 && userGrade < 66) {
                        System.out.println("Letter grade earned: D");
                        break;
                    } else if (userGrade == 66) {
                        System.out.println("Letter grade earned: D+");
                        break;
                    } else if (userGrade == 67) {
                        System.out.println("Letter grade earned: C-");
                        break;
                    } else if (userGrade > 67 && userGrade < 79) {
                        System.out.println("Letter grade earned: C");
                        break;
                    } else if (userGrade == 79) {
                        System.out.println("Letter grade earned: C+");
                        break;
                    } else if (userGrade == 80) {
                        System.out.println("Letter grade earned: B-");
                        break;
                    } else if (userGrade > 80 && userGrade < 87) {
                        System.out.println("Letter grade earned: B");
                        break;
                    } else if (userGrade == 87) {
                        System.out.println("Letter grade earned: B+");
                        break;
                    } else if (userGrade == 88) {
                        System.out.println("Letter grade earned: A-");
                        break;
                    } else if (userGrade > 88 && userGrade < 99) {
                        System.out.println("Letter grade earned: A");
                        break;
                    } else if (userGrade >= 99) {
                        System.out.println("Letter grade earned: A+");
                        break;
                    }
                } else if (!sc.hasNextByte()) {
                    System.out.println("Please enter a proper numerical grade");
                    sc.next();
                    break;
                } else {
                    System.out.println("Invalid input");
                    sc.next();
                    break;
                }
            }

            boolean exitProgram = false;
            while (!exitProgram) {
                System.out.println("Would you like to continue inputting numerical grades?(y/n) ");
                String userInput = sc.next();
                if (userInput.equalsIgnoreCase("y")) {
                    break;
                } else if (userInput.equalsIgnoreCase("n")) {
                    exitProgram = true;
                } else {
                    System.out.println("That is not a valid input\n");
                }
            }
            if (exitProgram) {
                System.out.println("Exiting program...");
                continueProgram = false;
            }
        }


    }
}

