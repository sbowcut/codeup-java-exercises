import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionsAndErrors {
//    ArrayList<Integer> myArrList = new ArrayList<Integer>();
//    myArrList.get(2);
//    public static void canBank(int age, int deposit){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter your age and how much you can deposit");
//
//        int userAge = sc.nextInt();
//        if ( ) {
//
//        }
//    }

    private final Scanner scanner;
    private int number;
    private double dbl;

    public ExceptionsAndErrors(){
        this.scanner = new Scanner(System.in);
        this.number = number;
        this.dbl = dbl;
    }
    public int getInt(){
        try{
            return Integer.valueOf(getString());
        }catch(NumberFormatException e) {
            System.out.println("Not an Integer");
            return getInt();
        }
    }
    public String getString(){
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Y or Yes, anything else is no: ");
        String answer = scanner.next().toLowerCase();

        if (answer.equals("y") || answer.equals("yes")){
            return true;
        }
        return false;
    }
public double getDbl(double min, double max){
//        this.dbl = getDbl();

        if (dbl < min) {
            System.out.println("Pick a number between " + min + " and " + max);
            getDbl(min, max);
        }else if (dbl > max); {
        System.out.println("Pick a number between " + min + " and " + max);
        getDbl(min, max);
    }
    return this.dbl;
}
}
