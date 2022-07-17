import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class FrameDemo {
    JFrame frame;
    JButton btn1,btn2;

    public FrameDemo() {
        frame = new JFrame("my app");
        btn1 = new JButton("btn1");
        btn2 = new JButton("btn2");
        frame.add(btn1,BorderLayout.NORTH);
        frame.add(btn2,BorderLayout.SOUTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button1 clicked");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button2 clicked");
            }
        });
    }

}

public class AnonymousDemo {
    public static void main(String[] args) {
        FrameDemo obj = new FrameDemo();
    }
}
