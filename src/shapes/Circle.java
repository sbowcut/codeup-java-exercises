package shapes;

import util.Input;

public class Circle {
    private final double radius;
    public int counter = 1;

    public Circle (double radius){
        this.radius = radius;
        getArea();
        getCircumference();
    }

    public void getArea () {
        double area = Math.PI * Math.pow(this.radius,2);
        System.out.println("Area of Circle is: " + area );
    }
    public void getCircumference () {
        double circumference = 2 * Math.PI * this.radius;
        System.out.println("Circumference of Circle is: " + circumference);
    }

    public void createNewCircle (boolean yesNo, Input input, String prompt){
        if (yesNo){
            double newRadius = input.getDouble("Enter New Radius");
            Circle newCircle = new Circle(newRadius);
            setCounter(counter);
            System.out.println("Circle #: " + getCounter() + "\n");
            createNewCircle(input.yesNo(prompt), input, prompt);
        } else {
            prompt = "Ending program";
            System.out.println(prompt);

        }


    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        counter++;
        this.counter = counter;
    }
}