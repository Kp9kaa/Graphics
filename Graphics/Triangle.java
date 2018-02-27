package Graphics;

import java.awt.*;

public class Triangle extends Bounded {
    public Triangle(int x1, int y1, int x2, int y2)
    {
        super(x1, y1, x2, y2);
    }
    public void draw( Graphics g )
    {
        g.drawRoundRect( getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight(), 5 ,5);

    }
}
