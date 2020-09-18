class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    private int same = 0;
    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }
    public int sameSpeed()
    {
        if (topLeft.xSpeed == bottomRight.xSpeed)
        {if (topLeft.ySpeed == bottomRight.ySpeed)
        {
            same = 1;
        }
        }
        return same;
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