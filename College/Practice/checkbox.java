import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="checkbox" width=400 height=400>
</applet> */
public class checkbox extends Applet implements ItemListener
{
Checkbox java = null;
Checkbox vb = null;
Checkbox c = null;

public void init() {
    java = new Checkbox("Java");
    vb = new Checkbox("Visual Basic");
    c = new Checkbox("C");
    add(java);
    add(vb);
    add(c);
    java.addItemListener(this);
    vb.addItemListener(this);
    c.addItemListener(this);
    }
    public void paint(Graphics g) {
    g.drawString("Java: " + java.getState(),10,80);
    g.drawString("VB: " + vb.getState(), 10, 100);
    g.drawString("C: " + c.getState(), 10, 120); 
    }
    public void itemStateChanged
    (ItemEvent ie
    )
    {
    repaint(); 
    }
    } 

