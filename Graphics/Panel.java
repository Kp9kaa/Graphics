package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class Panel extends JPanel{

    private int currentShape;
    private List<ShapeA> myShapes;
    private ShapeA currentShapeObj;
    public Panel(){
        myShapes = new List<ShapeA>();
        currentShape=0;
        currentShapeObj=null;
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        MouseH handler = new MouseH();
        addMouseListener(handler);
        addMouseMotionListener(handler);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ArrayList<ShapeA> shapeA=myShapes.getArray();
        for ( int counter=shapeA.size()-1; counter>=0; counter-- )
            shapeA.get(counter).draw(g);
        if (currentShapeObj!=null)
            currentShapeObj.draw(g);
    }
    public void setCurrentShapeType(int type)
    {
        currentShape=type;
    }
    public void clearDrawing()
    {
        myShapes.makeEmpty();
        repaint();
    }
    private class MouseH extends MouseAdapter
    {

        public void mousePressed( MouseEvent event )
        {
            switch (currentShape)
            {
                case 0:
                    currentShapeObj= new Line( event.getX(), event.getY(), event.getX(), event.getY());
                    break;
                case 1:
                    currentShapeObj= new Oval( event.getX(), event.getY(),
                            event.getX(), event.getY());
                    break;
                case 2:
                    currentShapeObj= new Rectangle( event.getX(), event.getY(),
                            event.getX(), event.getY());
                    break;
                case 3:
                    currentShapeObj= new Square( event.getX(), event.getY(),
                            event.getX(), event.getY());
                    break;
                case 4:
                    currentShapeObj= new Circle( event.getX(), event.getY(),
                            event.getX(), event.getY());
                    break;
                case 5:
                    currentShapeObj= new Triangle( event.getX(), event.getY(),
                            event.getX(), event.getY());
                    break;

            }
        }

        public void mouseReleased( MouseEvent event )
        {

            currentShapeObj.setX2(event.getX());
            currentShapeObj.setY2(event.getY());

            myShapes.addFront(currentShapeObj);

            currentShapeObj=null;
            repaint();

        }



        public void mouseDragged( MouseEvent event )
        {

            currentShapeObj.setX2(event.getX());
            currentShapeObj.setY2(event.getY());


            repaint();

        }

    }
}
