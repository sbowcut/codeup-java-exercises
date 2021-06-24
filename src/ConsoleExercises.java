import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f", pi);
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter 3 words: ");
//        String userInput1 = sc.nextLine();
//        String userInput2 = sc.nextLine();
//        String userInput3 = sc.nextLine();
//
//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);
        System.out.println("Please enter the dimensions of your room: ");
        float length = Float.parseFloat(sc.nextLine());
        float width = Float.parseFloat(sc.nextLine());

        System.out.printf("Perimeter: %s\n", (2 * length) + (2 * width));
        System.out.printf("Area: %s", length * width);

    }
}
