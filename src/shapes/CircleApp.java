package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input inputClass = new Input();

        double radius = inputClass.getDouble("Type In A Radius");
        Circle circle = new Circle(radius);

        circle.createNewCircle(inputClass.yesNo("Do you want to create a new circle? Y/N"),
                inputClass, "Do you want to create a new Circle? Y/N");


    }
}
