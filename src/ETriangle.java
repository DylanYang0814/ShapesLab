public class ETriangle extends Shape
{
    private int side;
    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }
    @Override
    public double getPerimeter()
    {
        return side*3;
    }
    @Override
    public double getArea()
    {
        return(Math.sqrt(3)/4)*(side*side);
    }
}
