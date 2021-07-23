package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double side) {
        super.length = super.width = side;
    }

    @Override
    void setWidth(double side) {
        super.width = super.length = side;
    }
}

