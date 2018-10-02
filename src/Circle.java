public class Circle extends Shape
{
    private int radius;
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return (radius * radius * 3.14);
    }
    @Override
    public double getPerimeter()
    {
        return (radius * 2 * 3.14);
    }
}
