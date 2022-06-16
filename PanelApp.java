package calcapp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class PanelDemo
{
    JFrame frame;
    JPanel panel;
    JButton b1,b2;
    public PanelDemo() {
        frame=new JFrame("calculator");
        panel=new JPanel();
        
        b1=new JButton("btn1");
        b2=new JButton("btn2");
        panel.add(b1);
        panel.add(b2);
        frame.add(panel);
        
        
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

public class PanelApp {
    public static void main(String[] args) {
      PanelDemo obj=new PanelDemo();
      
    }
    
}
