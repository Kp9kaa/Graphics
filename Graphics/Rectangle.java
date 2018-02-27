package Graphics;

import java.awt.Graphics;

public class Rectangle extends Bounded {
    public Rectangle(int x1, int y1, int x2, int y2)
    {
        super(x1, y1, x2, y2);
    }
    public void draw( Graphics g )
    {
        g.drawRect( getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight() );

    }
}
