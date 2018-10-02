public class Rectangle extends Shape{

    private int width;
    private int length;

    public Rectangle(int width, int length)
    {
        super("Rectangle");
        this.width = width;
        this.length = length;

    }
    @Override
    public double getArea()
    {
        return (width * length);
    }

    @Override
    public double getPerimeter()
    {
        return (width + length)*2;
    }
}
