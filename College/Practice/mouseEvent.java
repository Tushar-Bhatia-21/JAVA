import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class mouseEvent extends JApplet implements MouseListener{
    
    private int x,y;
    private String event;

    public void init()
    {
        setLayout(new FlowLayout());
        addMouseListener(this);
        x=-1;
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        g.drawRect(0, 0, getWidth(), getHeight());
        if(x!= -1)
        {
            g.drawString("Mouse Event "+ event + "at ("+x+","+y+")",10,20);
        }
    }

    public void mousePressed(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        event="press";
        repaint();
    }

    public void mouseClicked(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        event="press";
        repaint();
    }

    public void mouseReleased(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        event="release";
        repaint();
    }

    public void mouseEntered(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        event="enter";
        repaint();
    }
    public void mouseExited(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        event="exit";
        repaint();
    }
/*<applet code=mouseEvent width=400 height=400 ></applet>*/
}
