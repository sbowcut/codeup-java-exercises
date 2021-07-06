package CompanyTwo;

// extends keyword to create a subclass of the EmployeeTwo abstract class
public class Manager extends EmployeeTwo{
    // every child class must define the method
    public static void main(String[] args) {
        Manager Sam = new Manager();
        Sam.nameOfEmployee = "Sam";
        Sam.department = "Sales";
        System.out.println(Sam.nameOfEmployee + " works as a manager for the " + Sam.department + " department");
        }

    }

