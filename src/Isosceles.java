public class Isosceles extends Shape
    {
        private int side;
        public Isosceles(int side)
        {
            super("Isosceles");
            this.side = side;
        }
        @Override
        public double getPerimeter()
        {
            return side + (side * 1.5) + (side * 1.5);
        }
        @Override
        public double getArea()
        {
            return(Math.sqrt(3)/4)*(side*side);
        }


}
