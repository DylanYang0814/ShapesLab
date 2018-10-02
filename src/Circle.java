public class Circle extends Shape
{
    private int radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return (this.radius * this.radius * 3.14);
    }
    public double getPerimeter()
    {
        return (this.radius * 2 * 3.14);
    }
}
