package Orchard;

public class FruitPicker extends Fruits{
    public static void main(String[] args) {
        FruitPicker Sam = new FruitPicker();
        Sam.nameOfFruit = "banana";
        Sam.color = "yellow";
        Sam.size = "Small";
        Sam.type = "What does that even mean?";
        System.out.println(Sam.isFruit());
    }
}
