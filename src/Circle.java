public class Circle extends Shape
{
    private int radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }
    public int getArea()
    {
        return (int) (this.radius * this.radius * 3.14);
    }
    public int getPerimeter()
    {
        return (int) (this.radius * 2 * 3.14);
    }
}
