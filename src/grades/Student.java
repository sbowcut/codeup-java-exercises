package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (int grade : grades) {
            total = total + grade;
        }
        return total / grades.size();
    }

    public void print() {
        System.out.println("Student Name: " + getName());
        System.out.println("Avg grade: " + getGradeAverage());
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(" " + grade + " ");
        }
    }
}
