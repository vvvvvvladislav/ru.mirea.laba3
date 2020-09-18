
class Circle extends Shape {
    protected double radius;
    public Circle() { }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {return 3.14*radius*radius;}
    public double getPerimeter()
    {return 2*3.14*radius;}
    @Override
    public String toString()
    {
        return "Circle area: "+getArea()+" and perimeter: "+getPerimeter();
    }
}