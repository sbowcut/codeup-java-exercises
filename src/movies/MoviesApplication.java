package movies;
import java.util.Scanner;

public class MoviesApplication {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        home(sc);
    }

    public static void home(Scanner sc){
        System.out.println("What would you like to do?");
        System.out.println("---------------------------\n");
        System.out.println("0 - Exit");
        System.out.println("1 - View All Movies");
        System.out.println("2 - View Movies In The Animated Category");
        System.out.println("3 - View Movies In The Drama Category");
        System.out.println("4 - View Movies In The Horror Category");
        System.out.println("5 - View Movies In The Sci-Fi Category\n");

        System.out.println("---------------------------\n");
        System.out.print("Enter your choice: ");
        int choice = choice(sc);

        if (choice == 0){
            return;
        }

        if (choice == 1){
            viewAllMovies();
        }

        if (choice == 2){
            viewAllCategory("animated");
        }

        if (choice == 3){
            viewAllCategory("drama");
        }

        if (choice == 4){
            viewAllCategory("horror");
        }

        if (choice == 5){
            viewAllCategory("sci-fi");
        }

        System.out.println("\n---------------------------");
        System.out.println("0 - Exit");
        System.out.println("1 - Return To Home");
        System.out.println("---------------------------\n");
        System.out.print("Enter your choice: ");
        int choice2 = choice(sc);

        if (choice2 == 0){
            return;
        }

        if (choice2 == 1){
            home(sc);
        }
    }

    public static int choice(Scanner sc){
        int choice = sc.nextInt();
        if (!(choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5)){
            System.out.print("Not an option, Enter your choice: ");
            return choice(sc);
        } else {
            return choice;
        }
    }
    public static void viewAllMovies(){
        Movie[] movies = MoviesArray.findAll();
        for(Movie movie: movies){
            System.out.println(movie.getName() + " --- " + movie.getCategory().toUpperCase());
        }
    }

    public static void viewAllCategory(String category){

        Movie[] movies = MoviesArray.findAll();

        int count = 0;
        for(Movie movie: movies){
            if (movie.getCategory().equalsIgnoreCase(category)){
                count++;
            }
        }

        Movie[] categoryArr = new Movie[count];

        int maxIndex = --count;
        for(Movie movie: movies){

            if (movie.getCategory().equalsIgnoreCase(category)){
                categoryArr[maxIndex] = movie;
                maxIndex--;
            }
            if (count < 0)
                return;
        }
        for(Movie movie: categoryArr){
            System.out.println(movie.getName() + " --- " + movie.getCategory().toUpperCase());
        }
    }
}