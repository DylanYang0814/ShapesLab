public class ETriangle extends Shape
{
    private int side;
    public ETriangle(int side)
    {
        super("Triangle");
        this.side = side;
    }
    public double getPerimeter()
    {
        return side*3;
    }
    public double getArea()
    {
        return(Math.sqrt(3)/4)*(side*side);
    }
}
