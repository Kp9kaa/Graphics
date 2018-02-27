package Graphics;
import java.awt.Color;
import java.awt.Graphics;


public class Line extends ShapeA
{

    public Line()
    {
        super();
    }

    public Line( int x1, int y1, int x2, int y2)
    {
        super(x1, y1, x2, y2);
    }

    @Override
    public void draw( Graphics g )
    {

        g.drawLine( getX1(), getY1(), getX2(), getY2() );
    }
}
