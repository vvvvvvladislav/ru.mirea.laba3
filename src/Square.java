class Square extends Rectangle{
    public Square() {};
    public Square(double side) {
        this.width = side;
        this.length = side;
    };
    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    };
    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }
    public void setWidth(double side)
    {
        this.width = side;
        this.length = side;
    }
    public void setLength(double side)
    {
        this.width = side;
        this.length = side;
    }
    @Override
    public String toString()
    {
        return "Square area: "+getArea()+" and perimeter: "+getPerimeter();
    }
}
