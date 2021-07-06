package CompanyTwo;

// 1. create an abstract class using the 'abstract' keyword
// abstract classes cannot be instantiated
// instantiation - to create an instance (an object) of that class
// create a subclass from the abstract and then instantiate the subclass
abstract class EmployeeTwo {
    // define properties
    private String salary;
    public String nameOfEmployee;
    public String department;
    public String doWork(){
        return "I am working";
    }


}
