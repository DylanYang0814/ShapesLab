public class Triangle extends Shape{
    private int side;
    public Triangle() {

    }
    public double getPerimeter() {
        return side*3;
    }
    public double getArea() {
        return ((side*side) / 2);
    }
}
