package Graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame{
    private Panel panel;
    private JComboBox shapes;
    private String shapeForm[]={"Line","Rectangle","Oval","Circle","Triangle","Square"};
    private JPanel widgetJPanel;
    private JPanel widgetPadder;

    public Graphic(){
        super("Graphics");
        this.setBounds(100,100,1000,1000);
        panel= new Panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        widgetJPanel=new JPanel();
        widgetJPanel.setLayout(new GridLayout(1,6,10,10));
        widgetPadder= new JPanel();
        widgetPadder.setLayout(new FlowLayout(FlowLayout.LEADING,20,5));

        shapes = new JComboBox(shapeForm);

        widgetJPanel.add(shapes);
        widgetPadder.add(widgetJPanel);
        add(widgetPadder,BorderLayout.NORTH);
        add(panel,BorderLayout.CENTER);
        ItemListenerHand handler = new ItemListenerHand();

        shapes.addItemListener(handler);
    }
    private class ItemListenerHand implements ItemListener
    {
        public void itemStateChanged( ItemEvent event )
        {


            if ( event.getStateChange() == ItemEvent.SELECTED )
            {

                if ( event.getSource() == shapes)
                {
                    panel.setCurrentShapeType(shapes.getSelectedIndex());
                }
            }

        }
    }

}
