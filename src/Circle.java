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
        return (radius * radius * Math.PI);
    }
    @Override
    public double getPerimeter()
    {
        return (radius * 2 * Math.PI);
    }
}
