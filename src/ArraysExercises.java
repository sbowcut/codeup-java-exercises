import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        toString(numbers);



        Person person = new Person("George");
        Person person2 = new Person("Naomi");
        Person person3 = new Person("Gwen");

        String[] personArray = {person.getName(), person2.getName(), person3.getName()};
        System.out.println(Arrays.toString(personArray));

        String[] newArray = addPerson(personArray, "Charlie");
        System.out.println(Arrays.toString(newArray));

    }

    private static void toString(int[] numbers) {

        System.out.println(Arrays.toString(numbers));

    }

    static String[] addPerson(String[] person, String newPerson){

        person = Arrays.copyOf(person, person.length + 1);

        person[person.length - 1] = newPerson;

        return person;

    }

}
