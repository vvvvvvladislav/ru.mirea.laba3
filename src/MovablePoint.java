class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    MovablePoint(){}
    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString()
    {
        return "x: "+x+" y: "+y+" xSpeed: "+xSpeed+" ySpeed: "+ySpeed;
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
