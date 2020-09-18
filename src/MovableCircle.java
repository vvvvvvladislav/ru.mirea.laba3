class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }
    @Override
    public String toString()
    {
        return "radius: "+radius+"x: "+x+" y: "+y+" xSpeed: "+xSpeed+" ySpeed: "+ySpeed;
    }
    public void moveUp()
    {
        ySpeed++;
    };
    public void moveDown()
    {
        ySpeed--;
    };
    public void moveLeft()
    {
        xSpeed--;
    };
    public void moveRight()
    {
        xSpeed++;
    };
}