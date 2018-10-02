public class Ellipse extends Shape
{
    private int radius1;
    private int radius2;
    public Ellipse(int radius1, int radius2)
    {
        super("Ellipse");
        this.radius1 = radius1;
        this.radius2 = radius2;
    }
    @Override
    public double getArea()
    {
        return (2*Math.PI * Math.sqrt(((radius1*radius1) + (radius2*radius2))/2));
    }
    @Override
    public double getPerimeter()
    {
        return (radius1 * radius2 * Math.PI);
    }
}
