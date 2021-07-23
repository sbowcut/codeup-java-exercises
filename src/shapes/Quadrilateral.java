package shapes;

abstract class Quadrilateral implements Shape {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Quadrilateral() {
    }

    double getLength() {
        return length;
    }

    abstract void setLength(double length);

    double getWidth() {
        return width;
    }

    abstract void setWidth(double width);

}