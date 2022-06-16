package calcapp;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class FrameDemo
{
    JFrame frame;
    JButton b1,b2,b3,b4,b5;
    public FrameDemo() {
        frame=new JFrame("calculator");
        b1=new JButton("btn1");
        frame.add(b1,BorderLayout.NORTH);
        b2=new JButton("btn2");
        frame.add(b2,BorderLayout.EAST);
        b3=new JButton("btn3");
        frame.add(b3,BorderLayout.WEST);
        b4=new JButton("btn4");
        frame.add(b4,BorderLayout.SOUTH);
        b5=new JButton("btn5");
        frame.add(b5,BorderLayout.CENTER);
        
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

public class CalcApp {
    public static void main(String[] args) {
      FrameDemo obj=new FrameDemo();
      
    }
    
}
