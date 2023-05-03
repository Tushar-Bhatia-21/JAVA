import java.awt.*;
import java.awt.event.*;
public class Applet_button 
{
public static void main(String args[])
    {
        Frame f =new Frame("Button Example");
        Button btn=new Button("Click Here");
        
        btn.setBounds(50,100,80,30);    
        
        TextField tf=new TextField();
        tf.setBounds(50,50,150,50);
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Welcome");
            }
   });
    
    f.add(btn);
    f.add(tf);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }
}
