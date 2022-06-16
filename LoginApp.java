package calcapp;

import javax.swing.*;

class LoginDemo
{
    JFrame frame;
    JPanel panel;
    JButton b1,b2;
    JLabel lblUser,lblPass;
    JTextField tfUser;
    JPasswordField tfPass;
    public LoginDemo() {
        frame=new JFrame("calculator");
        panel=new JPanel();
        panel.setLayout(null);
        
        JLabel lblUser=new JLabel("Username:");
        lblUser.setBounds(50, 50, 100, 20);
        JLabel lblPass=new JLabel("Password:");
        lblPass.setBounds(50, 100, 100, 20);
        
        
        tfUser=new JTextField();
        tfUser.setBounds(170, 50, 100, 20);
        
        tfPass=new JPasswordField();
        tfPass.setBounds(170, 100, 100, 20);
        
        b1=new JButton("login");
        b1.setBounds(50,150,100,20);
        
        b2=new JButton("cancel");
        b2.setBounds(170,150,100,20);

        panel.add(lblUser);
        panel.add(tfUser);
        panel.add(lblPass);
        panel.add(tfPass);
        panel.add(b1);
        panel.add(b2);
        frame.add(panel);
        
        
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

public class LoginApp {
    public static void main(String[] args) {
      LoginDemo obj=new LoginDemo();
      
    }
    
}
